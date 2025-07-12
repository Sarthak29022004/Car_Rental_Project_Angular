import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MasterService {

  searchData: Subject<string> = new Subject<string>;
  
  constructor() { }
}
