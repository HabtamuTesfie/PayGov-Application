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
 * <p>Java class for SetAuthFlowParamRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetAuthFlowParamRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}SetAuthFlowParamRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAuthFlowParamRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "setAuthFlowParamRequestDetails"
})
public class SetAuthFlowParamRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SetAuthFlowParamRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected SetAuthFlowParamRequestDetailsType setAuthFlowParamRequestDetails;

    /**
     * Gets the value of the setAuthFlowParamRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SetAuthFlowParamRequestDetailsType }
     *     
     */
    public SetAuthFlowParamRequestDetailsType getSetAuthFlowParamRequestDetails() {
        return setAuthFlowParamRequestDetails;
    }

    /**
     * Sets the value of the setAuthFlowParamRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetAuthFlowParamRequestDetailsType }
     *     
     */
    public void setSetAuthFlowParamRequestDetails(SetAuthFlowParamRequestDetailsType value) {
        this.setAuthFlowParamRequestDetails = value;
    }

}
