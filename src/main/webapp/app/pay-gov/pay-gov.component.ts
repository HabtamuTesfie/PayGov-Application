import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Subject } from 'rxjs';
import { takeUntil } from 'rxjs/operators';
import { FormsModule } from '@angular/forms';
import { AccountService } from 'app/core/auth/account.service';
import { Account } from 'app/core/auth/account.model';
import { FormGroup, FormControl, Validators } from '@angular/forms';

import { HttpResponse } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { Observable } from 'rxjs';
import { finalize } from 'rxjs/operators';
import { HostListener } from '@angular/core';

import { IPaygov, Paygov } from './paygov.model';
import { SharedService } from '../shared.service';
import { PayService } from '../pg-confirmation/pay.service';

import { NgbActiveModal, NgbModal } from '@ng-bootstrap/ng-bootstrap';
SharedService;
@Component({
  selector: 'jhi-pay-gov',
  templateUrl: './pay-gov.component.html',
  styleUrls: ['./pay-gov.component.scss'],
})
export class PayGovComponent implements OnInit {
  form: any;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private sharedService: SharedService,
    private modalService: NgbModal,
    protected fb: FormBuilder
  ) {
    this.form = new FormGroup({
      cik: new FormControl('', Validators.compose([Validators.required, Validators.pattern('^[0-9]+[@#$%^&*()!]')])),
      paymentAmount: new FormControl('', Validators.required),
      ccc: new FormControl('', Validators.compose([Validators.required, Validators.min(100000)])),
      name: new FormControl('', Validators.required),
      email: new FormControl('', Validators.required),
      phone: new FormControl('', Validators.compose([Validators.required, Validators.pattern('^[0-9]{10}$')])),
    });
  }

  ngOnInit(): void {
    this.storeData();
  }

  previousState(): void {
    window.history.back();
  }

  storeData(): void {
    const data: any = this.form.value;

    this.sharedService.setData(data);
  }
  /* @HostListener('window:beforeunload', ['$event'])
    beforeunloadHandler(event:any) {
      return false;

  }*/

  @HostListener('window:beforeunload', ['$event'])
  showAlertMessageWhenClosingTab($event: any): void {
    event?.preventDefault();
    $event.returnValue(this.openSuccess());
  }

  openSuccess(): any {
    const modalRef = this.modalService.open(PgSuccessComponent);
  }
}
@Component({
  selector: 'jhi-pg-modal',
  template: `
    <div class="modal-header">
      <h4 class="modal-title"><strong>PayGov!</strong></h4>
      <button type="button" class="close" aria-label="Close" (click)="activeModal.dismiss('Cross click')">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>

    <div class="modal-body">
      <p><strong>Are you sure to close the window? </strong></p>
    </div>

    <div class="modal-footer">
      <button type="button" class="btn btn-outline-dark" (click)="close()">Close</button>
    </div>
  `,
})
export class PgSuccessComponent {
  isSaving = false;
  data: any;
  pgData: any;

  constructor(
    protected payService: PayService,
    protected fb: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private sharedService: SharedService,
    private modalService: NgbModal,
    public activeModal: NgbActiveModal
  ) {}

  close(): void {
    window.close();
    window.setTimeout(function () {
      location.href = '/index.html';
    }, 100000);
  }
}

/*
    <div>
       <ul>
           <p> Name : {{mockData.body.name}}</p>
           <p> Address : {{mockData.body.address}}</p>
           <p> Credit card number : {{mockData.body.creditCardNumber}}</p>
           <p> Expire date : {{mockData.body.expireDate}}</p>
       </ul>
    </div>
*/
