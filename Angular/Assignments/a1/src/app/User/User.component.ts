import { Component, OnInit } from '@angular/core';
import { RestmenuService } from '../restmenu.service';

@Component({
  selector: 'app-User',
  templateUrl: './User.component.html',
  styleUrls: ['./User.component.css']
})
export class UserComponent implements OnInit {

  constructor(private RestmenuService:RestmenuService) { }
  restmenu:any = new Map<any,string[]>();

  ngOnInit() {
  this.restmenu = this.RestmenuService.getRestmenu();
  }
}
