import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Bai4ComponentComponent } from './bai4-component.component';

describe('Bai4ComponentComponent', () => {
  let component: Bai4ComponentComponent;
  let fixture: ComponentFixture<Bai4ComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Bai4ComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Bai4ComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
