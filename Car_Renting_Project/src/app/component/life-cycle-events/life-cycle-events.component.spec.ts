import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LifeCycleEventsComponent } from './life-cycle-events.component';

describe('LifeCycleEventsComponent', () => {
  let component: LifeCycleEventsComponent;
  let fixture: ComponentFixture<LifeCycleEventsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LifeCycleEventsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LifeCycleEventsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
