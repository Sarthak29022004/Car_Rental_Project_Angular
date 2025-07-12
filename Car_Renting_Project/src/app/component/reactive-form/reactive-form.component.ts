import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  imports: [ReactiveFormsModule],
  templateUrl: './reactive-form.component.html',
  styleUrl: './reactive-form.component.css'
})
export class ReactiveFormComponent {
  studentForm: FormGroup;

  constructor() {
    this.studentForm = new FormGroup({
      firstName: new FormControl("", [Validators.required, Validators.minLength(2)]),
      lastName: new FormControl("", [Validators.required, Validators.minLength(2)]),
      userName: new FormControl("", Validators.email),
      city: new FormControl("", [Validators.required]),
      state: new FormControl("",[Validators.required]),
      zip: new FormControl("",[Validators.required]),
      terms: new FormControl("",[Validators.required]),
    })
  }
  formValue: any;
  onSave() {
    debugger
    this.formValue = this.studentForm.value;
    debugger
  }
}
