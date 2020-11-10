import { Component, OnInit } from '@angular/core';
import{NgForm} from '@angular/forms';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

user = new User();
  constructor(private _service: RegistrationService) { }

  ngOnInit() {
  }
loginUser(){
this._service.loginUserFromRemote(this.user).subscribe(
  data=>console.log("les info sontlas"),
  error=> console.log("tezzz")

)
}
}