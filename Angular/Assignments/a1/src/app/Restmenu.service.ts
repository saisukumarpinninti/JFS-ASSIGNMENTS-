import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RestmenuService {
  

  rm :any = new Map<any,string[]>();

getRestmenu() {
  return this.rm;
}
setRestmenu(rm:any) {
  this.rm = rm;
}
setrest(r:any){
  this.rm.set(r,[]);
}
deleteRest(item: any) {
  this.rm.delete(item);
}

constructor() {
  this.rm.set("1",["idly","vada","Puri","roti","pulka","pavbhaji"]);
  this.rm.set("2",["idly","vada","Puri","roti","pulka","pavbhaji"]);
 }
}


