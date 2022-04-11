import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { IEmployee } from './employee';
import { Observable,throwError as ObservableThrowError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable()
export class EmployeeService {
  
  // private _url: string = "http://localhost:8081/Q5/All";
  private _url: string = "../assets/data/employee detailss.json";
  constructor(private http:HttpClient) { }
  getEmployees(): Observable<IEmployee[]>{
    return this.http.get<IEmployee[]>(this._url).pipe(catchError(this.handlerError));
  }
  handlerError(error: HttpErrorResponse) {
    console.log(error.message);
    return ObservableThrowError(error.message || "Server Error");
  }
 
  

}
