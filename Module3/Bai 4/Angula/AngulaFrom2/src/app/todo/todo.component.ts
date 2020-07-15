import {Component, OnInit} from '@angular/core';
import {FormControl} from '@angular/forms';

interface ITodo {
  id: number;
  content: string;
  complete: boolean;
}

let _id = 1;

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  isHidden: boolean = true;
  userInput = new FormControl();
  todos: Array<ITodo> = [];

  show() {
  if(this.isHidden == false){
    this.isHidden = true ;
  }else {
    this.isHidden = false ;
  }
  }

  constructor() {
  }

  ngOnInit() {
  }

  onChange() {
    const {value} = this.userInput;
    if (value) {
      const todo: ITodo = {
        id: _id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.userInput.setValue('');
    }
  }

  toggleTodo(i) {
    this.todos[i].complete = !this.todos[i].complete;
  }

}
