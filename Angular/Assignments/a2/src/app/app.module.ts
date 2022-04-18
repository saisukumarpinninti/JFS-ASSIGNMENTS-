import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {routedComponents} from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MaterialComponents} from './material/material.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AdvertisementTableComponentComponent } from './AdvertisementTableComponent/AdvertisementTableComponent.component';
@NgModule({
  declarations: [			
    AppComponent,
    routedComponents,
      AdvertisementTableComponentComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialComponents,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
