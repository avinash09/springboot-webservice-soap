//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.03 at 01:09:13 AM IST 
//


package com.example.howtodoinjava.xml.school;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.howtodoinjava.xml.school package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.howtodoinjava.xml.school
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudentDetailsResponse }
     * 
     */
    public StudentDetailsResponse createStudentDetailsResponse() {
        return new StudentDetailsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link StudentDetailsRequest }
     * 
     */
    public StudentDetailsRequest createStudentDetailsRequest() {
        return new StudentDetailsRequest();
    }

}
