import { Route } from '@angular/router';
import { UserRouteAccessService } from 'app/core/auth/user-route-access.service';
import { PayGovComponent } from './pay-gov.component';

export const PayGov_ROUTE: Route = {
  path: 'pay-gov',
  component: PayGovComponent,
  data: {
    pageTitle: 'Welcome, PayGov !',
  },
};

