//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.10 at 06:13:01 AM GMT-09:00 
//


package com.mycompany.myapp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedeemedOfferType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RedeemedOfferType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MERCHANT_COUPON"/>
 *     &lt;enumeration value="LOYALTY_CARD"/>
 *     &lt;enumeration value="MANUFACTURER_COUPON"/>
 *     &lt;enumeration value="RESERVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RedeemedOfferType")
@XmlEnum
public enum RedeemedOfferType {

    MERCHANT_COUPON,
    LOYALTY_CARD,
    MANUFACTURER_COUPON,
    RESERVED;

    public String value() {
        return name();
    }

    public static RedeemedOfferType fromValue(String v) {
        return valueOf(v);
    }

}
