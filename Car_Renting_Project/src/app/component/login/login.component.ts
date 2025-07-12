import { HttpClient } from '@angular/common/http';
import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  //*********************Hard-core Login ******************
  loginObj: any = {
    username: '',
    password: ''
  }

  router = inject(Router);

  // onLogin2() {
  //   if (this.loginObj.username == 'pittu' && this.loginObj.password == '1234') {
  //     this.router.navigateByUrl('home');
  //   } else {
  //     alert("Wrong Credentials");
  //   }
  // }

  // ======================Api login========================

  apiLogin: any = {
    EmailId: '',
    password: ''
  }

  http = inject(HttpClient);

  onLogin() {
    this.http.post("https://projectapi.gerasim.in/api/UserApp/login", this.apiLogin).subscribe((res: any) => {
      debugger
      localStorage.setItem("Angular19User",res.data.userId)
      this.router.navigateByUrl("home");
    },error=>{
      debugger
      alert("Wrong Credentials");
    })
  }
}
