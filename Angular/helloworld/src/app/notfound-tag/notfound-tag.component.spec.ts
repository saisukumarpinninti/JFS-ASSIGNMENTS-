import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NotfoundTagComponent } from './notfound-tag.component';

describe('NotfoundTagComponent', () => {
  let component: NotfoundTagComponent;
  let fixture: ComponentFixture<NotfoundTagComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NotfoundTagComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NotfoundTagComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
