import { Component, OnInit } from '@angular/core';
import { FormArray, FormGroup ,FormBuilder,Validators} from '@angular/forms';
import {ForbiddenNameValidator,PasswordValidator} from './shared/validator';
import {FormsubmitService} from './formsubmit.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  submitted = false;
  constructor(private f: FormBuilder,private _Formssubmit :FormsubmitService) { }
  signupform!: FormGroup;
  ngOnInit(): void {
    this.signupform = this.f.group({
      username: ['',[Validators.required,Validators.minLength(3),ForbiddenNameValidator(/Sukumar/)]],
      email:['',[Validators.required,Validators.email]],
      subscribe: [false],
      password: ['',[Validators.required,Validators.minLength(8)]],
      confirmpassword: ['',Validators.required],
      address: this.f.group({
        city: [''],
        state: [''],
        zipcode: ['']
      }),
      alternateemails: this.f.array([])
    },{validator:PasswordValidator});
    this.signupform.get('subscribe')?.valueChanges.subscribe(checkedValue => {
      const email = this.signupform.get('email');
      if(checkedValue) {
        email.setValidators(Validators.required);
      } else {
        email.clearValidators();
      }
      email.updateValueAndValidity();
    }
    );
  }
  get alternateemails() {
    return this.signupform.get('alternateemails') as FormArray;
  }
  addAlternateEmail() { 
    this.alternateemails.push(this.f.control(''));
  }
  onsubmit() {
    this.submitted = true;
    console.log(this.signupform.value);
    this._Formssubmit.signup(this.signupform.value).subscribe(
      (   response: any) => console.log('Success!', response),
      (      error: any) => console.error('Error!', error)
    );
  }
  get username() {
    return this.signupform.get('username');
  }
  get password() {
    return this.signupform.get('password');
  }
  get confirmpassword() {
    return this.signupform.get('confirmpassword');
  }
  get email() {
    return this.signupform.get('email');
  }
  // signupform = new FormGroup({
  //   username: new FormControl(''),
  //   password: new FormControl(),
  //   confirmpassword: new FormControl(),
  //   address: new FormGroup({
  //     city: new FormControl(),
  //     state: new FormControl(),
  //     zipcode: new FormControl()
  //   })
  // });
  //SetValue Method
  /*
  loadApiData() {
    this.signupform.setValue({
      username: 'Sukumar',
      password: 'password',
      confirmpassword: 'password',
      address: {
        city: 'Bangalore',
        state: 'Karnataka',
        zipcode: '560037'
      }
    });
  }
  */
  //PatchValue Method
  loadApiData() {
    this.signupform.patchValue({
      username: 'Sukumar',
      password: ''
    });
  }


}
