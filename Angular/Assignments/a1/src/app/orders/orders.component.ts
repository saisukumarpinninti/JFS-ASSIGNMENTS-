import { Component, OnInit } from '@angular/core';
import { RestmenuService } from '../restmenu.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.scss']
})
export class OrdersComponent implements OnInit {
  bol1:boolean = true;
  errormsg: any;
  restmenu:any = new Map<any,string[]>();
  rm:any = new Map<any,string[]>();
  public sid: any ;
  id:any;
  constructor(private RestmenuService:RestmenuService,private _Router:Router,private route:ActivatedRoute) { }
  ngOnInit(): void {
  this.route.paramMap.subscribe((params:ParamMap)=>{
    this.sid = (<any>params.get('id'));})
    this.restmenu = this.RestmenuService.getRestmenu();
    if(this.restmenu.has(this.sid)){
      this.errormsg = null;
      this.id = this.sid;
      this.rm =this.restmenu.get(this.sid);
    }
    else{
      this.bol1 = false;
      this.errormsg = "Not Available";
    }
   }
   item:any;
   item2:any;
   item1:any;
   quantity:any;
    quantity1:any;
    quantity2:any;
    contact:any;
    address:any;
    
   onSubmit(){
    window.print();
    }
}
