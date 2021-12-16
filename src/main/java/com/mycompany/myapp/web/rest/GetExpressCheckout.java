package com.mycompany.myapp.web.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.CreateHostedCheckoutRequest;
import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.CreateHostedCheckoutResponse;
import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions.HostedCheckoutSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Customer;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.mycompany.myapp.PaymentStatusCodeType;
import com.mycompany.myapp.domain.MockPg;
import com.mycompany.myapp.domain.Pay;
import com.mycompany.myapp.repository.PayRepository;
import com.mycompany.myapp.web.rest.errors.BadRequestAlertException;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;

import javax.validation.Valid;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;
import com.paypal.sdk.exceptions.PayPalException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import liquibase.exception.InvalidChangeDefinitionException;
import liquibase.parser.core.ParsedNodeException;
import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentReq;
import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentRequestType;
import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentResponseType;
import urn.ebay.api.PayPalAPI.GetAuthDetailsResponseType;
import urn.ebay.api.PayPalAPI.GetExpressCheckoutDetailsReq;
import urn.ebay.api.PayPalAPI.GetExpressCheckoutDetailsRequestType;
import urn.ebay.api.PayPalAPI.PayPalAPIInterfaceServiceService;
import urn.ebay.api.PayPalAPI.SetExpressCheckoutReq;
import urn.ebay.api.PayPalAPI.SetExpressCheckoutRequestType;
import urn.ebay.api.PayPalAPI.SetExpressCheckoutResponseType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.CurrencyCodeType;
import urn.ebay.apis.eBLBaseComponents.GetExpressCheckoutDetailsResponseDetailsType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.SetExpressCheckoutRequestDetailsType;
import com.mycompany.myapp.util.Configuration;
import urn.ebay.api.PayPalAPI.GetExpressCheckoutDetailsResponseType;
import urn.ebay.apis.eBLBaseComponents.DoExpressCheckoutPaymentRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.DoExpressCheckoutPaymentResponseDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * REST controller for managing {@link com.mycompany.myapp.domain.Pay}.
 */
@RestController
@RequestMapping("/api")
@Transactional

public class GetExpressCheckout {
    @GetMapping("/paypalGetChechout")
    public GetExpressCheckoutDetailsResponseDetailsType getExpressCheckoutDetails(String token) throws
     PayPalException,FileNotFoundException,SAXException,ParserConfigurationException,SSLConfigurationException
     ,InvalidChangeDefinitionException,UnsupportedEncodingException,HttpErrorException,InvalidResponseDataException
     ,ClientActionRequiredException,MissingCredentialException,OAuthException,IOException,InterruptedException{
		//CallerServices caller = new CallerServices();
        
		//APIProfile profile = ...;
        Map<String,String> configurationMap =  Configuration.getAcctAndConfig();
        // Creating service wrapper object to make an API call by loading configuration map.
        PayPalAPIInterfaceServiceService service = new PayPalAPIInterfaceServiceService(configurationMap);

        GetExpressCheckoutDetailsReq grequest=new GetExpressCheckoutDetailsReq();
		GetExpressCheckoutDetailsRequestType pprequest = new GetExpressCheckoutDetailsRequestType();
		pprequest.setVersion("63.0");
		pprequest.setToken(token);
        
       grequest.setGetExpressCheckoutDetailsRequest(pprequest);
       GetExpressCheckoutDetailsResponseType ppresponse=null;

 try{
     ppresponse = service.getExpressCheckoutDetails(grequest);  
    }
catch(Exception e)
   {
    System.out.println(e);
    }
    System.out.println("===========================================================");
    System.out.println("===========================================================");
    System.out.println("===========================================================");

     System.out.println(ppresponse.getGetExpressCheckoutDetailsResponseDetails());

    System.out.println("===========================================================");
    System.out.println("===========================================================");
    System.out.println("===========================================================");

    //doExpressCheckoutService(ppresponse.getGetExpressCheckoutDetailsResponseDetails());
 return ppresponse.getGetExpressCheckoutDetailsResponseDetails();

	 }
}
