import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DepartmentComponent } from './department/department.component';
import { EmployeedetailComponent } from './employeedetail/employeedetail.component';
import { Hw1Component } from './hw1/hw1.component';
import { NotfoundTagComponent } from './notfound-tag/notfound-tag.component';
const routes: Routes = [
  {path: '',pathMatch: 'full',redirectTo: ''},
{path : 'employees'  , component : Hw1Component},
{path :'employee/:id' , component : EmployeedetailComponent},
{path : 'departments' , component : DepartmentComponent},
{path : '**' , component : NotfoundTagComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [Hw1Component, DepartmentComponent,NotfoundTagComponent, EmployeedetailComponent];