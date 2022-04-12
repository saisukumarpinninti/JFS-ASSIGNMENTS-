import { Component, OnInit } from '@angular/core';
import { RestmenuService } from '../restmenu.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {

  constructor(private RestmenuService:RestmenuService) { }
  restmenu:any = new Map<any,string[]>();

  ngOnInit(): void {
  this.restmenu = this.RestmenuService.getRestmenu();
  }
  public name ="";
  addrest(item:string){
    this.RestmenuService.setrest(item);
  }
  public item ="";
  Deletefrommap(item: any){
    this.RestmenuService.deleteRest(item);
  }

}
