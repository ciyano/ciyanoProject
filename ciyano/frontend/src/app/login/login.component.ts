import { Component, OnInit } from '@angular/core';
import{NgForm} from '@angular/forms';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

user = new User();
msg ='';


  constructor(private _service: RegistrationService, private _router: Router ) { }

  ngOnInit() {
  }
loginUser(){
this._service.loginUserFromRemote(this.user).subscribe(
  data=>{console.log("les info sontlas")
this._router.navigate(['/loginsucces'])
  },
  error=> {console.log("tezzz")
  this.msg="bad credentials, please enter valid emailid and password";
}
)
}
}
