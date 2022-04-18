import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdvertisementFormComponent } from './AdvertisementForm/AdvertisementForm.component';
import { AdvertisementTableComponentComponent } from './AdvertisementTableComponent/AdvertisementTableComponent.component';
import { NotfoundTagComponent } from './NotfoundTag/NotfoundTag.component';
const routes: Routes = [
  { path: 'form', component: AdvertisementFormComponent },
  {path:'all',component:AdvertisementTableComponentComponent},
  { path: '', pathMatch: 'full', redirectTo: 'all' },
  { path: '**', component: NotfoundTagComponent }];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routedComponents = [
  AdvertisementFormComponent,
  NotfoundTagComponent,
  AdvertisementTableComponentComponent
                      ];
// End of file
