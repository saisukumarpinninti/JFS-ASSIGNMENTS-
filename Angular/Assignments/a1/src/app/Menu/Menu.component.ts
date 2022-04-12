import { Component, OnInit } from '@angular/core';
import { RestmenuService } from '../restmenu.service';

@Component({
  selector: 'app-Menu',
  templateUrl: './Menu.component.html',
  styleUrls: ['./Menu.component.css']
})
export class MenuComponent implements OnInit {
  constructor(private RestmenuService:RestmenuService) { }
  restmenu:any = new Map<any,string[]>();

  ngOnInit() {
  this.restmenu = this.RestmenuService.getRestmenu();
  }
  

 
}
