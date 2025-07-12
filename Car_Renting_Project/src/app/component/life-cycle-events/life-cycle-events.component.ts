import { AfterContentInit, Component, OnInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy, inject } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-life-cycle-events',
  imports: [RouterLink],
  templateUrl: './life-cycle-events.component.html',
  styleUrl: './life-cycle-events.component.css'
})
export class LifeCycleEventsComponent implements OnInit, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {
  constructor() {
    console.log("Constructor");
  }

  ngOnInit(): void {
    console.log("ngOnInit");
  }

  ngAfterContentInit(): void {
    console.log("ngAfterContentInit");
  }

  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked");
  }

  ngAfterViewInit(): void {
    console.log("ngAfterViewInit");
  }

  ngAfterViewChecked(): void {
    console.log("ngAfterViewChecked");
  }

  ngOnDestroy(): void {
    alert("You are leaving page");
    console.log("ngOnDestroy");
  }

  router = inject(Router);
  goToReactiveForm() {
    this.router.navigateByUrl("reactive-form");
  }
}
