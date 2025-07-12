import { Component, inject } from '@angular/core';
import { FormControl, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  userName: FormControl = new FormControl("");
  password: FormControl = new FormControl("");

  router = inject(Router)

  onLogin() {
    debugger
    if (this.userName.value == 'pittu' && this.password.value == '2345') {
      this.router.navigateByUrl('dashboard');
    } else {
      alert("Wrong Credentials");
    }
  }
}
