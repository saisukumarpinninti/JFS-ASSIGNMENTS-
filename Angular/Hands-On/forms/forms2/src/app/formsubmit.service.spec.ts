/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { FormsubmitService } from './formsubmit.service';

describe('Service: Formsubmit', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [FormsubmitService]
    });
  });

  it('should ...', inject([FormsubmitService], (service: FormsubmitService) => {
    expect(service).toBeTruthy();
  }));
});
