import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { inject } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { Car, IcarList } from '../../../model/car';

@Component({
  selector: 'app-get-api',
  imports: [FormsModule],
  templateUrl: './get-api.component.html',
  styleUrl: './get-api.component.css'
})
export class GetApiComponent {

  carList: IcarList[] = [];

  carObj: Car = new Car();

  constructor(private http: HttpClient) {

  }

  getApi() {
    this.http.get("https://freeapi.miniprojectideas.com/api/CarRentalApp/GetCars").subscribe((res: any) => {
      // debugger
      this.carList = res.data;
      // debugger
    })
  }

  postApi() {
    this.http.post("https://freeapi.miniprojectideas.com/api/CarRentalApp/CreateNewCar", this.carObj).subscribe((res: any) => {
      if (res.result) {
        alert("You successfully created new car record")
        this.getApi();
        this.carObj = new Car();
      } else {
        alert(res.message)
      }
      
    })
  }

  onEdit(data: any) {
    this.carObj = data;
  }

  updateApi() {
    this.http.put("https://freeapi.miniprojectideas.com/api/CarRentalApp/UpdateCar", this.carObj).subscribe((res: any) => {
      if (res.result) {
        alert("Record successfully updated")
        this.getApi()
      } else {
        alert(res.message)
      }
    })
  }

  onDelete(id: number) {
    const isDelete = confirm("Are you sure want to delete ?")
    if (isDelete == true) {
      this.http.delete("https://freeapi.miniprojectideas.com/api/CarRentalApp/DeleteCarbyCarId?carid=" + id).subscribe((res: any) => {
        if (res.result) {
          alert("Record successfully deleted")
          this.getApi();
        } else {
          alert(res.message)
        }
      })
    }
  }
}
