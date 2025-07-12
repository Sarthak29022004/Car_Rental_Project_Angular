import { Component, inject } from '@angular/core';
import { RouterModule, RouterOutlet, Router } from '@angular/router';

@Component({
  selector: 'app-lay-out',
  imports: [RouterModule, RouterOutlet],
  templateUrl: './lay-out.component.html',
  styleUrl: './lay-out.component.css'
})
export class LayOutComponent {
  router = inject(Router)

  onLogOut() {
    localStorage.removeItem("Angular19User");
    this.router.navigateByUrl("login");
  }
}
