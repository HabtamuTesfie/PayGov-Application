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
 * <p>Java class for ButtonImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ButtonImageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="REG"/>
 *     &lt;enumeration value="SML"/>
 *     &lt;enumeration value="CC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ButtonImageType")
@XmlEnum
public enum ButtonImageType {


    /**
     *   button image type is REG
     * 
     */
    REG,

    /**
     *   button image type is SML
     * 
     */
    SML,

    /**
     *  button image type is CC
     * 
     */
    CC;

    public String value() {
        return name();
    }

    public static ButtonImageType fromValue(String v) {
        return valueOf(v);
    }

}
