import { AfterViewInit, Component, inject, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { UserviceService } from '../uservice/service/uservice.service';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';

import {ChangeDetectionStrategy, model} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {MatCardModule} from '@angular/material/card';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatRadioModule} from '@angular/material/radio';


@Component({
  selector: 'app-am',
  imports: [MatTableModule, MatPaginatorModule, MatCardModule, MatCheckboxModule, FormsModule, MatRadioModule, MatInputModule, MatFormFieldModule],
  changeDetection: ChangeDetectionStrategy.OnPush ,
  templateUrl: './am.component.html',
  styleUrl: './am.component.css'
})
export class AMComponent implements AfterViewInit, OnInit {
  dataSource = new MatTableDataSource();
  displayedColumns: string[] = ['index', 'firstName', 'lastName', 'gender', 'age'];

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  ngAfterViewInit(): void {
    this.dataSource.paginator = this.paginator;
  }
  ngOnInit(): void {
    this.loadData()
  }

  uSrv = inject(UserviceService)

  loadData() {
    this.uSrv.getUrlData().subscribe((res: any) => {
      this.dataSource.data = res;             //important .data
    })
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }




  readonly checked = model(false);
  readonly indeterminate = model(false);
  readonly labelPosition = model<'before' | 'after'>('after');
  readonly disabled = model(false);





  // urlTableData= new MatTableDataSource();
  // applyFilter2(event: Event) {
  //   const filterValue = (event.target as HTMLInputElement).value;
  //   this.dataSource.filter = filterValue.trim().toLowerCase();
  // }
}