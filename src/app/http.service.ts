import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
 
@Injectable({
  providedIn: 'root'
})
export class HttpService {
  
  private baseurl :string ="http://localhost:8080/";

  constructor(private http:HttpClient ) { }

booking(obj:any){

 return (this.http.post(`${this.baseurl}booktrade`,obj))

}
getAllEmp(){
  return  (this.http.get(`${this.baseurl}getallemployee`))
 }

 printing(): Observable<any>  {
  return this.http.get(`${this.baseurl }printtrade`);
}
}
