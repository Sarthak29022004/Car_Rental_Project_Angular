import { NgIf } from '@angular/common';
import { Component, inject, resource } from '@angular/core';
import { MasterService } from '../../service/master.service';

@Component({
  selector: 'app-customer',
  imports: [NgIf],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {

  masterService = inject(MasterService);

  

  customerList = resource({
    loader: () => {
      return fetch("https://freeapi.miniprojectideas.com/api/CarRentalApp/GetCustomers").then((result) => result.json() as Promise<any>)
    }
  })
}
