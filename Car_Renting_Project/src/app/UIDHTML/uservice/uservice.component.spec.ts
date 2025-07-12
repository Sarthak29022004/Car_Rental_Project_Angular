import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserviceComponent } from './uservice.component';

describe('UserviceComponent', () => {
  let component: UserviceComponent;
  let fixture: ComponentFixture<UserviceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UserviceComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
