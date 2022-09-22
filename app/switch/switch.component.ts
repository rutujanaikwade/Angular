import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switch',
  templateUrl: './switch.component.html',
  styleUrls: ['./switch.component.css']
})
export class SwitchComponent implements OnInit {
choice:string='';
  constructor() { }

  ngOnInit(): void {
  }

  onSend(inputcolor:string){
    this.choice=inputcolor.trim().toLowerCase();
  }
}
