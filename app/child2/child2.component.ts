import { Component, EventEmitter, OnInit ,Output} from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrls: ['./child2.component.css']
})
export class Child2Component implements OnInit {

  @Output() ChildStrEvent=new EventEmitter();
  strdata:string="Child to Parent";

  jsonobj={
      id:9,
      fname:'Rutuja',
      dept:'comp'
    }
    Childjsonobj=new EventEmitter();
   

  constructor() { }

  ngOnInit(): void {
  }

  Onsend(){
    this.ChildStrEvent.emit(this.strdata);
    this.Childjsonobj.emit(this.jsonobj);
  }
}
