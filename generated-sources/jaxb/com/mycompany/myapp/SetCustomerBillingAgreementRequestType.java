//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.10 at 06:13:01 AM GMT-09:00 
//


package com.mycompany.myapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetCustomerBillingAgreementRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetCustomerBillingAgreementRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}SetCustomerBillingAgreementRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetCustomerBillingAgreementRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "setCustomerBillingAgreementRequestDetails"
})
public class SetCustomerBillingAgreementRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SetCustomerBillingAgreementRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected SetCustomerBillingAgreementRequestDetailsType setCustomerBillingAgreementRequestDetails;

    /**
     * Gets the value of the setCustomerBillingAgreementRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SetCustomerBillingAgreementRequestDetailsType }
     *     
     */
    public SetCustomerBillingAgreementRequestDetailsType getSetCustomerBillingAgreementRequestDetails() {
        return setCustomerBillingAgreementRequestDetails;
    }

    /**
     * Sets the value of the setCustomerBillingAgreementRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCustomerBillingAgreementRequestDetailsType }
     *     
     */
    public void setSetCustomerBillingAgreementRequestDetails(SetCustomerBillingAgreementRequestDetailsType value) {
        this.setCustomerBillingAgreementRequestDetails = value;
    }

}
