import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  constructor() {
  }

  result: number;
  fist: number;
  laster: number;
  caculator = "+"

  fistNumber(value) {
    this.fist = Number(value)
  }

  lasterNumber(value) {
    this.laster = Number(value)
  }

  caculatorChange(value) {
    this.caculator = value;
  }

  caculate() {
    switch (this.caculator) {
      case '+' :
        this.result = Number(this.fist + this.laster);
        break;
      case '-':
        this.result = Number(this.fist - this.laster);
        break;
      case 'x':
        this.result = Number(this.fist * this.laster);
        break;
      case '/':
        this.result = Number(this.fist / this.laster);
        break;
    }
  }

  ngOnInit() {
  }

}
