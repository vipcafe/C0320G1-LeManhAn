import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bai4-component',
  templateUrl: './bai4-component.component.html',
  styleUrls: ['./bai4-component.component.css']
})
export class Bai4ComponentComponent implements OnInit {

  user: String = "Anlee Pro";
  password : String ="123456789";
  email : String = "vipcafe1994@gmail.com"
  constructor() { }

  ngOnInit() {
  }

}
