import { HttpClient } from '@angular/common/http';
import { Component, inject, OnInit } from '@angular/core';

@Component({
  selector: 'app-bookings',
  imports: [],
  templateUrl: './bookings.component.html',
  styleUrl: './bookings.component.css'
})
export class BookingsComponent implements OnInit{

  bookingList: any[] = [];

  http = inject(HttpClient);

  ngOnInit(): void {
      this.getBooking();
  }

  getBooking(){
    this.http.get("https://freeapi.miniprojectideas.com/api/CarRentalApp/geAllBookings").subscribe((res:any)=>{
      this.bookingList = res;
    })
  }
}
