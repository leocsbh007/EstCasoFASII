
package com.grepcepws.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.grepcepws.entity.xsd.ObterCepResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.grepcepws.ws package. 
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

    private final static QName _ObterEnderecoCepToken_QNAME = new QName("http://ws.grepcepws.com", "token");
    private final static QName _ObterEnderecoCepCep_QNAME = new QName("http://ws.grepcepws.com", "cep");
    private final static QName _ObterEnderecoCepResponseReturn_QNAME = new QName("http://ws.grepcepws.com", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.grepcepws.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObterEnderecoCep }
     * 
     */
    public ObterEnderecoCep createObterEnderecoCep() {
        return new ObterEnderecoCep();
    }

    /**
     * Create an instance of {@link ObterEnderecoCepResponse }
     * 
     */
    public ObterEnderecoCepResponse createObterEnderecoCepResponse() {
        return new ObterEnderecoCepResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.grepcepws.com", name = "token", scope = ObterEnderecoCep.class)
    public JAXBElement<String> createObterEnderecoCepToken(String value) {
        return new JAXBElement<String>(_ObterEnderecoCepToken_QNAME, String.class, ObterEnderecoCep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.grepcepws.com", name = "cep", scope = ObterEnderecoCep.class)
    public JAXBElement<String> createObterEnderecoCepCep(String value) {
        return new JAXBElement<String>(_ObterEnderecoCepCep_QNAME, String.class, ObterEnderecoCep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterCepResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.grepcepws.com", name = "return", scope = ObterEnderecoCepResponse.class)
    public JAXBElement<ObterCepResponse> createObterEnderecoCepResponseReturn(ObterCepResponse value) {
        return new JAXBElement<ObterCepResponse>(_ObterEnderecoCepResponseReturn_QNAME, ObterCepResponse.class, ObterEnderecoCepResponse.class, value);
    }

}
