/*package com.mycompany.myapp.web.rest;
 
import com.paypal.sdk.exceptions.PayPalException;

import org.w3c.dom.Node;

import urn.ebay.api.PayPalAPI.PayPalAPIInterfaceServiceService;
import urn.ebay.api.PayPalAPI.SetExpressCheckoutRequestType;
import urn.ebay.api.PayPalAPI.SetExpressCheckoutResponseType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.CurrencyCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.SetExpressCheckoutRequestDetailsType;
import com.mycompany.myapp.util.Configuration;

import java.util.Map;







public class SoapResource {
    public String setExpressCheckout(Long userId, Node paymentAmount,
			CurrencyCodeType currencyCodeType, String returnURL, String cancelURL,
				PaymentActionCodeType paymentAction) throws PayPalException{
	 Map<String,String> configurationMap =  Configuration.getAcctAndConfig();


        PayPalAPIInterfaceServiceService service = new PayPalAPIInterfaceServiceService(configurationMap);


		//construct the request
		SetExpressCheckoutRequestType pprequest = new SetExpressCheckoutRequestType();
		pprequest.setVersion("63.0");

		//construct the details for the request
		SetExpressCheckoutRequestDetailsType details = new SetExpressCheckoutRequestDetailsType();

		PaymentDetailsType paymentDetails = new PaymentDetailsType();
		paymentDetails.setOrderDescription("Integrating Stuff Test Order");
		paymentDetails.setInvoiceID("INVOICE-" + Math.random());
		BasicAmountType orderTotal = new BasicAmountType(paymentAmount);
		orderTotal.setCurrencyID(currencyCodeType);
		paymentDetails.setOrderTotal(orderTotal);
		paymentDetails.setPaymentAction(paymentAction);
		details.setPaymentDetails(new PaymentDetailsType[]{paymentDetails});

		details.setReturnURL(returnURL);
		details.setCancelURL(cancelURL);
		details.setCustom(userId.toString());

		//set the details on the request
		pprequest.setSetExpressCheckoutRequestDetails(details);

		//call the actual webservice, passing the constructed request
		SetExpressCheckoutResponseType ppresponse = (SetExpressCheckoutResponseType) service.call("SetExpressCheckout", pprequest);

		//get the token from the response
		return ppresponse.getToken();
	}
}
*/