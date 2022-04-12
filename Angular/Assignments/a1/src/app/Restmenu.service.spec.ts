/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { RestmenuService } from './Restmenu.service';

describe('Service: Restmenu', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RestmenuService]
    });
  });

  it('should ...', inject([RestmenuService], (service: RestmenuService) => {
    expect(service).toBeTruthy();
  }));
});
