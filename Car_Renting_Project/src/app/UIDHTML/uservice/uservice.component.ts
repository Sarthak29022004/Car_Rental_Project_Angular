import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { UserviceService } from './service/uservice.service';
import { CommonModule } from '@angular/common';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';




@Component({
  selector: 'app-uservice',
  imports: [CommonModule, MatFormFieldModule, MatInputModule, MatTableModule, MatPaginatorModule],
  templateUrl: './uservice.component.html',
  styleUrl: './uservice.component.css'
})
export class UserviceComponent implements OnInit, AfterViewInit {

  tabledata: any[] = [];
  urlTableData: any[] = [];
  filteredUrlTableData: any[] = [];
  
  dataSource = new MatTableDataSource();
  displayedColumns: string[] = ['firstName', 'lastName', 'gender', 'age', 'email', 'username', 'birthDate', 'city'];

  constructor(private uService: UserviceService) { }

  ngOnInit(): void {
    // this.loadTable();
    this.loadUrlData();
  }

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  ngAfterViewInit(): void {
    this.dataSource.paginator = this.paginator;
  }

  // loadTable() {
  //   this.uService.getTable().subscribe({
  //     next: (res: any) => {
  //       this.tabledata = res;
  //     },
  //     error: (err) => {
  //       console.log(err);
  //     },
  //     complete: () => { },
  //   })
  // }

  loadUrlData() {
    this.uService.getUrlData().subscribe({
      next: (res: any) => {
        this.urlTableData = res;
        this.filteredUrlTableData = res;
        this.dataSource.data = res;
      },
      error: (err) => {
        alert(err);
      }
    })
  }

  SearchEmployeeByName(event: Event) {
    const input = event.target as HTMLInputElement
    console.log(input.value);
    this.filteredUrlTableData = this.urlTableData.filter((employee) =>
      employee.firstName.toLowerCase().includes(input.value.toLowerCase())
    )
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
}
