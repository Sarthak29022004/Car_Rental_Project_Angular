import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-template-form',
  imports: [FormsModule],
  templateUrl: './template-form.component.html',
  styleUrl: './template-form.component.css'
})
export class TemplateFormComponent {
  studentObj:any={
    firstName:'',
    lastName:'',
    username:'',
    city:'',
    state:'',
    zip:'',
    agreeTerms:false
  }

  formsvalue:any;
  onSubmit(){
    debugger
    this.formsvalue=this.studentObj;
    debugger
  }
}
