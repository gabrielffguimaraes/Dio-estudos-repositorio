import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'spa-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  showHideSidebar:boolean = false;
  msg!:string;
  constructor() { }

  ngOnInit(): void {
  }

  message(msg:string){
    this.msg = msg;
  }
}
