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

import { IPaygov, Paygov } from './paygov.model';
import { SharedService } from '../shared.service';
SharedService
@Component({
  selector: 'jhi-pay-gov',
  templateUrl: './pay-gov.component.html',
  styleUrls: ['./pay-gov.component.scss']
})

export class PayGovComponent implements OnInit {
  form : any;

  constructor(
    private router : Router,
    private route : ActivatedRoute,
    private sharedService : SharedService,
    protected fb: FormBuilder
    )
    {
        this.form = new FormGroup({
          cik: new FormControl("",Validators.compose([Validators.required,Validators.pattern('^[0-9]+[@#$%^&*()!]')])),
          paymentAmount: new FormControl("",Validators.required),
          ccc: new FormControl("",Validators.compose([Validators.required,Validators.min(100000)])),
          name: new FormControl("",Validators.required),
          email: new FormControl("",Validators.required),
          phone: new FormControl("",Validators.compose([Validators.required,Validators.pattern('^[0-9]{10}$')]))

        })
    }


    ngOnInit() : void{
       this.storeData();

    }

    previousState(): void {
        window.history.back();
    }

    storeData() : void{
        const data : any = this.form.value;
        this.sharedService.setData(data);
    }

}
