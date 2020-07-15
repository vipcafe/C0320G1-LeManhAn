import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-font-size-editor',
  templateUrl: './font-size-editor.component.html',
  styleUrls: ['./font-size-editor.component.css']
})
export class FontSizeEditorComponent implements OnInit {

  isHidden: boolean = false;
  fontSize = 14;

  showF() {
    if (this.isHidden == true) {
      this.isHidden = false;
    } else {
      this.isHidden = true;
    }
  }

  onChange(value) {
    this.fontSize = value;
  }

  constructor() {
  }

  ngOnInit() {
  }

}


