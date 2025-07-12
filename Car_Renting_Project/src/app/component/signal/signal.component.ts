import { ChangeDetectionStrategy, Component, linkedSignal, signal } from '@angular/core';

@Component({
  selector: 'app-signal',
  imports: [],
  templateUrl: './signal.component.html',
  styleUrl: './signal.component.css',
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class SignalComponent {

  firstName = signal("Sarthak");
  lastName = signal<string>("Bobhate");
  sirName = signal<string>("");

  courseName = "Angular";

  constructor() {
    setTimeout(() => {
      this.firstName.set("Pittu");
      this.courseName = "React JS";
    }, 5000)
  }

  rollNo = signal<number>(1);
  onIncrement() {
    this.rollNo.update(oldValue => oldValue + 1);
  }

  // =====================   Linked Signals   ======================

  fullName = linkedSignal({
    source: this.firstName,
    computation: (source, previous) => {
      const fullName = source + " " + this.lastName()
      return fullName;
    }
  })
}
