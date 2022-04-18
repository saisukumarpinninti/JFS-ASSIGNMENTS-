import { AfterViewInit, Component, OnInit ,ViewChild} from '@angular/core';
import { AdService } from '../ad.service';
import {MatTableDataSource} from '@angular/material/table';
import {MatSort} from '@angular/material/sort';
import {MatPaginator} from '@angular/material/paginator';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';


@Component({
  selector: 'app-AdvertisementTableComponent',
  templateUrl: './AdvertisementTableComponent.component.html',
  styleUrls: ['./AdvertisementTableComponent.component.css']
})
export class AdvertisementTableComponentComponent implements OnInit ,AfterViewInit{
  static ad: any;
  constructor(private _add: AdService,private f: FormBuilder,) { }
  AdvertisementForm!: FormGroup;
  categories = ['furniture ','HardWare','Mobile'];
  @ViewChild(MatSort, {static: true}) sort: MatSort=new MatSort;
  @ViewChild(MatPaginator, { static: true })
  paginator!: MatPaginator;
  ad: any ;
  dataSource: any;
  displayedColumns: string[] = ['title', 'name', 'category', 'description','Actions'];
  ngOnInit(): void {
    this.ad = this._add.getad();
    this.dataSource = new MatTableDataSource( [...this.ad]);
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
    this.AdvertisementForm = this.f.group({
      title: ['', [Validators.required, Validators.minLength(5)]],
      name: ['', [Validators.required, Validators.minLength(5)]],
      category:['', Validators.required],
      description:['',Validators.maxLength(200)],
    });
  }
  ngAfterViewInit(): void {
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
  }
  refresh() {
    this.dataSource = new MatTableDataSource( [...this.ad]);
  }
  logad() {
    console.log(this.ad);
  }
  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
  deletead(title: string) {
    console.log(title);
    let i ;
    for(let z=0;z<this.ad.length;z++){if(this.ad[z].title==title){i=z;}}
    console.log(i);
    this.ad.splice(i,1);
    this._add.deletead(this.ad);
    this.refresh();
  }
  openDialog(title:string,name:string,category:string,description:string): void {
    var modal = document.getElementById("myModal");
    this.AdvertisementForm.controls['title'].setValue(title);
    this.AdvertisementForm.controls['name'].setValue(name);
    this.AdvertisementForm.controls['category'].setValue(category);
    this.AdvertisementForm.controls['description'].setValue(description);
    modal!.style.display = "block";
  }
  closeDialog(): void {
    var modal = document.getElementById("myModal");
    modal!.style.display = "none";
  }
  editad(title:any){ 
    console.log(title);
    let i ;
    for(let z=0;z<this.ad.length;z++){if(this.ad[z].title==title){
      i=z;
      this.ad[z].title=this.AdvertisementForm.value.title;
      this.ad[z].name=this.AdvertisementForm.value.name;
      this.ad[z].category=this.AdvertisementForm.value.category;
      this.ad[z].description=this.AdvertisementForm.value.description;
      console.log(this.ad[z]);
    }}
      this._add.editad(this.ad);
  }
  onSubmit() {}
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



