import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-data-binding',
  imports: [CommonModule, FormsModule,RouterLink],
  templateUrl: './data-binding.component.html',
  styleUrl: './data-binding.component.css'
})
export class DataBindingComponent {
  firstName: string = "Sarthak Bobhate";
  rollNo: number = 123;
  isActive: boolean = true;
  currentDate: Date = new Date();
  myPlaceholder: string = "Write_your_name";
  myName: string = this.firstName;
  background: string = "bg-primary";
  div1BgColor: string = "bg-success";
  div2BgColor: boolean = false;
  input1: string = '';
  input2: string = '';

  constructor() {
    console.log(this.firstName);

  }

  div1ColorR() {
    this.div1BgColor = "bg-danger";
  }
  div1ColorB() {
    this.div1BgColor = "bg-primary";
  }

  div2Color() {
    this.div2BgColor = !this.div2BgColor;
  }

  student: any[] = [
    { Name: "ABC", Number: 101, Gender: "Male", Status: true, totalMarks: 98 },
    { Name: "PQR", Number: 102, Gender: "Female", Status: true, totalMarks: 70 },
    { Name: "KLM", Number: 103, Gender: "Male", Status: false, totalMarks: 84 },
    { Name: "XYZ", Number: 104, Gender: "Female", Status: true, totalMarks: 75 }
  ]
}
