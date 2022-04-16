import { Component, OnInit } from '@angular/core';
import { Router ,ActivatedRoute,ParamMap} from '@angular/router';

@Component({
  selector: 'app-employeedetail',
  templateUrl: './employeedetail.component.html',
  styleUrls: ['./employeedetail.component.scss']
})
export class EmployeedetailComponent implements OnInit {
  constructor(private route:ActivatedRoute,private r :Router) { }
  public employeeid: any ;
  ngOnInit(): void {
    this.route.paramMap.subscribe((params:ParamMap)=>{
      this.employeeid = parseInt(<any>params.get('id'));})}
    previous(){
      let previousid = this.employeeid - 1;
      if (previousid === 1) {
        previousid = 1;
        this.r.navigate(['/employee',previousid]);
      }
      else{
      this.r.navigate(['/employee',previousid]);}
    }
    next(){
      let nextid  = this.employeeid + 1;
      this.r.navigate(['/employee',nextid]);
    }
    gotoemployeelist(){
      let sid = this.employeeid ? this.employeeid : null;
      this.r.navigate(['/employees',{id:sid}]);}
}
