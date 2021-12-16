import { Route } from '@angular/router';
import { PayGovComponent } from '../pay-gov/pay-gov.component';

export const HOME_ROUTE: Route = {
  path: '',
  component: PayGovComponent,
  data: {
    pageTitle: 'Welcome, Pay-Gov!',
  },
};
