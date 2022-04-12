import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { MenuComponent } from './Menu/Menu.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { UserComponent } from './User/User.component';
import { NotfoundTagComponentComponent } from './NotfoundTagComponent/NotfoundTagComponent.component';
import { OrdersComponent } from './orders/orders.component';
const routes: Routes = [
  { path: 'admin', component: AdminComponent },
  { path: 'User', component: UserComponent,  },
  {path:"order/:id",component: OrdersComponent},
  {path: 'Restauraunt/:id', component: RestaurantComponent },
  { path: 'Owner', component: MenuComponent },
  { path: '', pathMatch: 'full', redirectTo: '/User' },
  { path: '**', component: NotfoundTagComponentComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [AdminComponent,
  MenuComponent,
  RestaurantComponent,
  UserComponent,MenuComponent,OrdersComponent,
  NotfoundTagComponentComponent];
