//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.01 at 12:29:23 PM CEST 
//


package com.baeldung.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rentrequest" type="{http://www.baeldung.com/springsoap/gen}rentrequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rentrequest"
})
@XmlRootElement(name = "getRentRequestRequest")
public class GetRentRequestRequest {

    @XmlElement(required = true)
    protected Rentrequest rentrequest;

    /**
     * Gets the value of the rentrequest property.
     * 
     * @return
     *     possible object is
     *     {@link Rentrequest }
     *     
     */
    public Rentrequest getRentrequest() {
        return rentrequest;
    }

    /**
     * Sets the value of the rentrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rentrequest }
     *     
     */
    public void setRentrequest(Rentrequest value) {
        this.rentrequest = value;
    }

}
