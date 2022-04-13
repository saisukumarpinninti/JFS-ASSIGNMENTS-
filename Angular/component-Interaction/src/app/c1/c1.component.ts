import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-c1',
  templateUrl: './c1.component.html',
  styleUrls: ['./c1.component.css']
})
export class C1Component implements OnChanges {
  @Input() loggedin: boolean = false;
  message: string = "";
  @Output() evntemit = new EventEmitter();
  constructor() { }
  ngOnChanges(changes: SimpleChanges) {
    let loggedin = changes['loggedin'].currentValue;
    if (loggedin) {
      this.message = "Welcome to the app " + this.name;
    } else {
      this.message = "Please login to continue";
    }
  }
  public name = "Sukumar";
  log(name: any) {
    console.log(name);
  }
  public greet() {
    this.evntemit.emit(this.name);
  }

}

/* //implementing onInit interface 
export class C1Component implements OnInit {
  // @Input() loggedin: boolean = false;
  constructor() { }
 private _loggedin:boolean = true;
 message: string = "";
 public get loggedin() :boolean {
   return this._loggedin;
 }
 @Input() 
 public set loggedin(value:boolean) {
   if(value===true){
    this.message = "You are logged in";}
    else{  this._loggedin = value;
    this.message = "You are logged out";}
  }
  ngOnInit() {
  }

}*/
