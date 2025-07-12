import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../../services/customer.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-customer',
  imports: [FormsModule],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent implements OnInit {

  constructor(private custServ: CustomerService) {

  }

  ngOnInit(): void {
    //debugger
    this.getCustomers();
  }

  customerList: any[] = [];

  customerObj: any = {
    "customerId": 0,
    "customerName": "",
    "customerCity": "",
    "mobileNo": "",
    "email": ""
  }

  getCustomers() {
    this.custServ.loadCustomers().subscribe((res: any) => {
      this.customerList = res.data;
    })
  }

  postCustomer() {
    debugger
    this.custServ.createNewCustomer(this.customerObj).subscribe((res: any) => {
      debugger
      if (res.result) {
        alert("Successfully create new customer");
        debugger
        this.getCustomers();
        debugger
      } else {
        debugger
        alert(res.message);
        debugger
      }
    })
  }
}
