import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { LoginsuccesComponent } from './loginsucces/loginsucces.component';
import { RegistrationComponent } from './registration/registration.component';

const routes: Routes = [
{path: '', component:LoginComponent},
{path:'loginsucces', component: LoginsuccesComponent},
{path:'registration', component: RegistrationComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
