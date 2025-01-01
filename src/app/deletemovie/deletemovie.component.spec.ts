import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletemovieComponent } from './deletemovie.component';

describe('DeletemovieComponent', () => {
  let component: DeletemovieComponent;
  let fixture: ComponentFixture<DeletemovieComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletemovieComponent]
    });
    fixture = TestBed.createComponent(DeletemovieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
