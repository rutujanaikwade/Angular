import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  parentstr:string='Send Data Parent to Child';
  
  stuobj=[{
        name:'Rutuja',
        id:101,
        dept:'comp'
      },
      {
        name:'onkar',
        id:102,
        dept:'it'
      },
      {
        name:'Harshal',
        id:103,
        dept:'comp'
      },
      {
        name:'Sagar',
        id:104,
        dept:'it'
      }

    ]


  
  constructor() { }

  ngOnInit(): void {
  }

}
