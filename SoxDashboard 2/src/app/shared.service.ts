import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class SharedService {
  readonly APIUrl = "http://localhost:8080/api/v1/project"
  constructor(private http:HttpClient) {}
    getDeptList():Observable<any[]>{
    return this.http.get<any>(this.APIUrl);
    }
    addProject(val:any){
    return this.http.post(this.APIUrl,val);
    }
    getAllProjectNames():Observable<any>{
    return this.http.get<any[]>(this.APIUrl)
    }
}
