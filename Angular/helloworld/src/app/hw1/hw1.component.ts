import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './../emp.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';

@Component({
  selector: 'app-hw1',
  templateUrl: './hw1.component.html',
  styleUrls: ['./hw1.component.scss']
})
export class Hw1Component implements OnInit {
  public employees : any = [];
  errormsg: any;
  public sid: any ;
  constructor(private _employeeService: EmployeeService, private _Router:Router,private route:ActivatedRoute) { }
  ngOnInit(): void {
    this.route.paramMap.subscribe((params:ParamMap)=>{
      this.sid = parseInt(<any>params.get('id'));})
    this._employeeService.getEmployees()
      .subscribe(data => this.employees = data,
        error => this.errormsg = error);
        console.log(this.sid);
  }
  isSelect(id: any) {
    
    console.log(id === this.sid);
    return id === this.sid; 
  }
  public sampoutput = "";
  public clicked = true;
  public getcolor = "red" ;
  public onClick(value: any) {
    console.log(this.employees);
    alert(`your input is ${value}`);  // alert message
  }
  

}
