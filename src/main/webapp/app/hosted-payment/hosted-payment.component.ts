import { Component, OnInit, Input } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder, Validators } from '@angular/forms';
import { Observable } from 'rxjs';
import { finalize } from 'rxjs/operators';
import { IPay, Pay } from '../pg-confirmation/pay.model';
import { IHostedPayment, HostedPayment } from '../pg-confirmation/hostedpayment.model';
import { PayService } from '../pg-confirmation/pay.service';
import { SharedService } from '../shared.service';
import { NgbActiveModal, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { BrowserModule, Title } from '@angular/platform-browser';
import { Subject, Subscription, timer } from 'rxjs';
import { switchMap, take, tap } from 'rxjs/operators';
import { DomSanitizer, SafeResourceUrl, SafeUrl} from '@angular/platform-browser';

@Component({
  selector: 'jhi-hosted-payment',
  templateUrl: './hosted-payment.component.html',
  styleUrls: ['./hosted-payment.component.scss']
})
export class HostedPaymentComponent implements OnInit {
redirectUrl:any;
String1 : any = "https://payment.";
String2 : any;
String3 : any;
hostedPaymentUrl : any;
frame : any;
constructor(
        protected payService: PayService, protected fb: FormBuilder,
        private router : Router,
        private route : ActivatedRoute,
        private sharedService : SharedService,
        private modalService: NgbModal,
        public sanitizer: DomSanitizer
        )
        {

        }


    ngOnInit() : void{
             this.payService.getHostedPayment().subscribe((result:any)=>{
             this.redirectUrl = result;
             this.String2 = this.redirectUrl.body.partialRedirectUrl;
             this.String3 = this.String1.concat(this.String2.toString());

             this.paymentUrl(this.String3);

        });
    }

    paymentUrl(url:any):any{
          this.hostedPaymentUrl = this.sanitizer.bypassSecurityTrustResourceUrl(url);
        }

}
