import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserviceService {

  constructor(private http: HttpClient) { }

  // getTable() {
  //   return of([
  //     {
  //       id: 1,
  //       name: 'sarthak',
  //       class: 'TE',
  //       div: 'A',
  //       city: 'Kolhapur'
  //     },
  //     {
  //       id: 2,
  //       name: 'sahil',
  //       class: 'TE',
  //       div: 'B',
  //       city: 'Jejuri'
  //     },
  //     {
  //       id: 3,
  //       name: 'omkar',
  //       class: 'TE',
  //       div: 'A',
  //       city: 'Junnar'
  //     },
  //     {
  //       id: 4,
  //       name: 'sanket',
  //       class: 'TE',
  //       div: 'A',
  //       city: 'Nagar'
  //     },
  //     {
  //       id: 5,
  //       name: 'siddhant',
  //       class: 'TE',
  //       div: 'A',
  //       city: 'Baramati'
  //     }
  //   ])
  // }

  getUrlData(): Observable<any> {
    return this.http.get<any>(`https://dummyjson.com/users`).pipe(
      map((data) =>
        data.users.map((user: any) => {
          user.gender = user.gender == 'male' ? 'M' : 'F';
          return user;
        })
      )
    )
  }
}
