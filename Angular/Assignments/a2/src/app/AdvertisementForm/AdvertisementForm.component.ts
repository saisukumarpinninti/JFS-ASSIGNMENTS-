import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router ,ActivatedRoute} from '@angular/router';
import { AdService } from '../ad.service';
import { AppComponent } from '../app.component';
@Component({
  selector: 'app-AdvertisementForm',
  templateUrl: './AdvertisementForm.component.html',
  styleUrls: ['./AdvertisementForm.component.css']
})
export class AdvertisementFormComponent implements OnInit {
  @Output("refresh") refresh: EventEmitter<any> = new EventEmitter();
  submitted = false;
  constructor(private f: FormBuilder,private appc:AppComponent,private Ac: AdService) { }
  AdvertisementForm!: FormGroup;
  categories = ['furniture ','HardWare','Mobile'];
  ad:any=[];
  ngOnInit() {
    this.AdvertisementForm = this.f.group({
      title: ['test2', [Validators.required, Validators.minLength(5)]],
      name: ['sukumar', [Validators.required, Validators.minLength(5)]],
      category:['Mobile', Validators.required],
      description:['',Validators.maxLength(200)],
    });
    this.ad=this.Ac.getad();
    }
    onSubmit() {
      this.refresh.emit();
    }
  addtoarr(){
    if(this.AdvertisementForm.valid){
      this.submitted = true;
    }
    this.Ac.setad(this.ad,this.AdvertisementForm.value);
  }
  
  // Getters to access form control
  get title() {
    return this.AdvertisementForm.get('title');
  }
  get name() {
    return this.AdvertisementForm.get('name');
  }
  get category() {
    return this.AdvertisementForm.get('category');
  }
  get description() {
    return this.AdvertisementForm.get('description');
  }
  
}

