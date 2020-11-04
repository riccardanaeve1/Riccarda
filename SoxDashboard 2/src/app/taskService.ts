
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class taskService {
  readonly APIUrl = 'http://localhost:8080/api/v1/project/task'
  constructor(private http:HttpClient) {}

  public getTask(){
    return this.http.get("http://localhost:8080/api/v1/project/task");
  }
}
