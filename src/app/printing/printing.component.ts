import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-printing',
  templateUrl: './printing.component.html',
  styleUrls: ['./printing.component.css']
})
export class PrintingComponent implements OnInit {
  datas:any[]=[];
  p:number=1;
 
 constructor(private service:HttpService ,
             private router:Router) { }

 ngOnInit(): void {
   this.trade();
 }

 trade(){
   this.service.printing().subscribe((res:any)=>{
     console.log(res);
     this.datas=res;
   })
 }
onClick(){
 this.router.navigate(['']);
}

}