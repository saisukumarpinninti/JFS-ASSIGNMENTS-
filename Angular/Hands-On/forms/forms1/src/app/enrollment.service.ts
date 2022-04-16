import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError,throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EnrollmentService {


  _url = 'http://localhost:3000/enroll';
constructor(private httpclient:HttpClient) { }
enroll(user:any){
  return this.httpclient.post(this._url,user)
  .pipe(catchError(this.errorHandler));
} 
  errorHandler(error: any)  {
    return throwError(error);
    
  }
}
