import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http: HttpClient) { }

  apiUrl: string = "https://freeapi.miniprojectideas.com/api/CarRentalApp/";

  loadCustomers() {
    return this.http.get(this.apiUrl + "GetCustomers");
  }

  createNewCustomer(obj: any) {
    debugger
    return this.http.post(this.apiUrl + "CreateNewCustomer", obj);
    debugger
  }
}
