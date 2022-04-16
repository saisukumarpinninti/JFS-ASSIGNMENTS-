import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './../emp.service';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.scss']
})
export class DepartmentComponent implements OnInit {
  public employees : any = [];
  errormsg: any;
  constructor(private _employeeService: EmployeeService) { }
  ngOnInit() {
    this._employeeService.getEmployees()
      .subscribe(data => this.employees = data,
        error => this.errormsg = error);
  }

}
