import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
 
@Injectable({
  providedIn: 'root'
})
export class HttpService {
  
  private baseurl :string ="http://localhost:8080/fxtrading"
  constructor(private http:HttpClient ) { }

book(obj:any){

 return (this.http.post(`${this.baseurl}booktrade`,obj))

}

}
