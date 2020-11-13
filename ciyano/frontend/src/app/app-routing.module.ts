import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { LoginsuccesComponent } from './loginsucces/loginsucces.component';

const routes: Routes = [
{path: '', component:LoginComponent},
{path:'loginsucces', component: LoginsuccesComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
