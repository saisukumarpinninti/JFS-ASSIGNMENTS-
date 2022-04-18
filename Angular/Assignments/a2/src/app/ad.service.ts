import { Injectable, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class AdService implements OnInit{
  constructor() { }
  ad= [
    { title: 'test1', name: 'test1', category: 'mobile', description: 'lorempsum' },
    { title: 'test2', name: 'test2', category: 'mobile', description: 'lorempsum' },
    { title: 'test3', name: 'test3', category: 'mobile', description: 'lorempsum' },
    { title: 'test4', name: 'test4', category: 'mobile', description: 'lorempsum' },
    { title: 'test5', name: 'test5', category: 'mobile', description: 'lorempsum' },
    { title: 'test6', name: 'test6', category: 'mobile', description: 'lorempsum' },
    { title: 'test7', name: 'test7', category: 'mobile', description: 'lorempsum' },
  ]; ;
  ngOnInit(): void {
    this.ad=this.ad;
  }
  getad():any{
    return this.ad;
  }
  setad(ad:any,data:any){
    this.ad.push(data);
    ad=this.ad;
  }
  deletead(ad:any){
    this.ad=ad;
  }
  editad(ad:any){
    this.ad=ad;
  }

}


