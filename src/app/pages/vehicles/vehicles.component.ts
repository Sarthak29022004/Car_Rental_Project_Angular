import { AsyncPipe, JsonPipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, signal, inject } from '@angular/core';
import { map, Observable } from 'rxjs';

@Component({
  selector: 'app-vehicles',
  imports: [ AsyncPipe],
  templateUrl: './vehicles.component.html',
  styleUrl: './vehicles.component.css'
})
export class VehiclesComponent {
  vehicleFormData = signal({
    carId: 0,
    brand: "",
    model: "",
    year: 0,
    color: "",
    dailyRate: 0,
    carImage: "",
    regNo: ""
  });
  carList$: Observable<any[]> = new Observable<any[]>;

  constructor() {
    this.carList$ = this.http.get<any[]>(`${this.apiUrl}GetCars`).pipe(
      map((result: any) => {
        return result.data;
      })
    )
  }

  updateForm(key: string, event: any) {
    this.vehicleFormData.update((data: any) => ({ ...data, [key]:event.target.value}))
  }

  http = inject(HttpClient);
  apiUrl: string = "https://freeapi.miniprojectideas.com/api/CarRentalApp/";

  onSave() {
    this.http.post(`${this.apiUrl}CreateNewCar`, this.vehicleFormData()).subscribe((res: any) => {
      if (res.result) {
        alert("Car created successfully")
      } else {
        alert(res.message)
      }
    })
  }
}
