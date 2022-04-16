import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { EnrollmentService } from './enrollment.service';
import { of } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private EnrollmentService: EnrollmentService) { }
  topics = ['Angular', 'React', 'Vue'];
  user = new User('', '', 0, '', '', false);
  errormsg = '';
  submitted = false;
  error = false

  topicHasError!: boolean;
  validateTopic(value: string) {
    if (value === '') {
      this.topicHasError = true;
    } else {
      this.topicHasError = false;
    }
  }
  onSubmit() {
    if (this.user.name === ''
      || this.user.email === ''
      || this.user.phone === 0
      || this.user.topic === ''
      || this.user.time === '') {
      console.error('Form is invalid');
    }
    else {
      this.submitted = true;
      console.log('Form is valid & Data is sending to server');
      (this.EnrollmentService.enroll(this.user)).
        subscribe((data) => console.log(data), (error) => { this.errormsg = error.statusText; error = true });
    }
  }

}
