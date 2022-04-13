import { AfterViewInit, Component, ElementRef, ViewChild } from '@angular/core';
import { C1Component } from './c1/c1.component';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements AfterViewInit {
  bool1: boolean = true;
  userloggedin: boolean = true;
  countvalue = 0;
  name: String = "";
  uname: String = "";
  private _cname: String = "";

  ngAfterViewInit(): void {
    this.nameElementRef.nativeElement.focus();
    this.child.name = "Sukumar";


  }
  @ViewChild('child')
  child: C1Component = new C1Component;
  urls = [
    "https://programmerhumor.io/wp-content/uploads/2022/04/programmerhumor-io-javascript-memes-programming-memes-a197c27225a5381-608x506.jpg",
    "https://programmerhumor.io/wp-content/uploads/2022/04/programmerhumor-io-programming-memes-9f2ffd6e611aadd-608x488.jpg",
    "https://programmerhumor.io/wp-content/uploads/2022/04/programmerhumor-io-stackoverflow-memes-programming-memes-2ceccfdc7b80829-608x660.jpg",
    "https://programmerhumor.io/wp-content/uploads/2022/04/programmerhumor-io-programming-memes-6ea09bac7e87607.png"

  ];
  number = Math.floor(Math.random() * this.urls.length);

  imageUrl = this.urls[this.number];

  increment() {
    this.countvalue++;
    this.number = Math.floor(Math.random() * this.urls.length);
    this.imageUrl = this.urls[this.number];
    console.log(this.number);
  }

  @ViewChild('nameRef') nameElementRef!: ElementRef;

  greet(uname: String) {
    if (uname == "sukumar") {
      alert("Hello " + uname);
    }
    else {
      alert("Hello " + uname);
    }
  }
  get cname(): String {
    return this._cname;
  }
  set cname(value: String) {
    this._cname = value;
    if (value == "sukumar") {
      alert("Hello " + this._cname);
    }
  }
  boolchange(value: boolean) {
    if (value === true) {
      this.bool1 = false;
    }
    else {
      this.bool1 = true;
    }
  }

}
