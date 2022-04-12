import { Component, OnInit } from '@angular/core';
import { RestmenuService } from '../restmenu.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.scss']
})
export class RestaurantComponent implements OnInit {
  
  restmenu:any = new Map<any,string[]>();
  rm:any = new Map<any,string[]>();
  errormsg: any;
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
      this.errormsg = "Not Available";
    }
   }
  public name ="";
  public item="";
  addtoarray(item:string){
    this.rm.push(item);
    // console.log(this.id);
    this.id=String(this.id);
    this.restmenu.set(this.id,this.rm);
    // console.log(this.restmenu);
    this.RestmenuService.setRestmenu(this.restmenu);
  }
  Deletefromarray(item: any){
    this.rm.splice(this.rm.indexOf(item),1);
    this.id=String(this.id);
    this.restmenu.set(this.id,this.rm);
    this.RestmenuService.setRestmenu(this.restmenu);}
  // Deletefromarray(item: any){
  //   console.log(item);}
}


