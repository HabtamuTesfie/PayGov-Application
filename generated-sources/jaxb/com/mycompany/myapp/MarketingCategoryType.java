//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.10 at 06:13:01 AM GMT-09:00 
//


package com.mycompany.myapp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketingCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketingCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Marketing-Category-Default"/>
 *     &lt;enumeration value="Marketing-Category1"/>
 *     &lt;enumeration value="Marketing-Category2"/>
 *     &lt;enumeration value="Marketing-Category3"/>
 *     &lt;enumeration value="Marketing-Category4"/>
 *     &lt;enumeration value="Marketing-Category5"/>
 *     &lt;enumeration value="Marketing-Category6"/>
 *     &lt;enumeration value="Marketing-Category7"/>
 *     &lt;enumeration value="Marketing-Category8"/>
 *     &lt;enumeration value="Marketing-Category9"/>
 *     &lt;enumeration value="Marketing-Category10"/>
 *     &lt;enumeration value="Marketing-Category11"/>
 *     &lt;enumeration value="Marketing-Category12"/>
 *     &lt;enumeration value="Marketing-Category13"/>
 *     &lt;enumeration value="Marketing-Category14"/>
 *     &lt;enumeration value="Marketing-Category15"/>
 *     &lt;enumeration value="Marketing-Category16"/>
 *     &lt;enumeration value="Marketing-Category17"/>
 *     &lt;enumeration value="Marketing-Category18"/>
 *     &lt;enumeration value="Marketing-Category19"/>
 *     &lt;enumeration value="Marketing-Category20"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketingCategoryType")
@XmlEnum
public enum MarketingCategoryType {

    @XmlEnumValue("Marketing-Category-Default")
    MARKETING_CATEGORY_DEFAULT("Marketing-Category-Default"),
    @XmlEnumValue("Marketing-Category1")
    MARKETING_CATEGORY_1("Marketing-Category1"),
    @XmlEnumValue("Marketing-Category2")
    MARKETING_CATEGORY_2("Marketing-Category2"),
    @XmlEnumValue("Marketing-Category3")
    MARKETING_CATEGORY_3("Marketing-Category3"),
    @XmlEnumValue("Marketing-Category4")
    MARKETING_CATEGORY_4("Marketing-Category4"),
    @XmlEnumValue("Marketing-Category5")
    MARKETING_CATEGORY_5("Marketing-Category5"),
    @XmlEnumValue("Marketing-Category6")
    MARKETING_CATEGORY_6("Marketing-Category6"),
    @XmlEnumValue("Marketing-Category7")
    MARKETING_CATEGORY_7("Marketing-Category7"),
    @XmlEnumValue("Marketing-Category8")
    MARKETING_CATEGORY_8("Marketing-Category8"),
    @XmlEnumValue("Marketing-Category9")
    MARKETING_CATEGORY_9("Marketing-Category9"),
    @XmlEnumValue("Marketing-Category10")
    MARKETING_CATEGORY_10("Marketing-Category10"),
    @XmlEnumValue("Marketing-Category11")
    MARKETING_CATEGORY_11("Marketing-Category11"),
    @XmlEnumValue("Marketing-Category12")
    MARKETING_CATEGORY_12("Marketing-Category12"),
    @XmlEnumValue("Marketing-Category13")
    MARKETING_CATEGORY_13("Marketing-Category13"),
    @XmlEnumValue("Marketing-Category14")
    MARKETING_CATEGORY_14("Marketing-Category14"),
    @XmlEnumValue("Marketing-Category15")
    MARKETING_CATEGORY_15("Marketing-Category15"),
    @XmlEnumValue("Marketing-Category16")
    MARKETING_CATEGORY_16("Marketing-Category16"),
    @XmlEnumValue("Marketing-Category17")
    MARKETING_CATEGORY_17("Marketing-Category17"),
    @XmlEnumValue("Marketing-Category18")
    MARKETING_CATEGORY_18("Marketing-Category18"),
    @XmlEnumValue("Marketing-Category19")
    MARKETING_CATEGORY_19("Marketing-Category19"),
    @XmlEnumValue("Marketing-Category20")
    MARKETING_CATEGORY_20("Marketing-Category20");
    private final String value;

    MarketingCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketingCategoryType fromValue(String v) {
        for (MarketingCategoryType c: MarketingCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
