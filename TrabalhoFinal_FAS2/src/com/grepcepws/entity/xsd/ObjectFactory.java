
package com.grepcepws.entity.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.grepcepws.entity.xsd package. 
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

    private final static QName _ObterCepResponseResponseDescription_QNAME = new QName("http://entity.grepcepws.com/xsd", "responseDescription");
    private final static QName _ObterCepResponseResponseCode_QNAME = new QName("http://entity.grepcepws.com/xsd", "responseCode");
    private final static QName _ObterCepResponseTransactionId_QNAME = new QName("http://entity.grepcepws.com/xsd", "transactionId");
    private final static QName _CepLogradouro_QNAME = new QName("http://entity.grepcepws.com/xsd", "logradouro");
    private final static QName _CepRegiao_QNAME = new QName("http://entity.grepcepws.com/xsd", "regiao");
    private final static QName _CepLatitude_QNAME = new QName("http://entity.grepcepws.com/xsd", "latitude");
    private final static QName _CepLongitude_QNAME = new QName("http://entity.grepcepws.com/xsd", "longitude");
    private final static QName _CepId_QNAME = new QName("http://entity.grepcepws.com/xsd", "id");
    private final static QName _CepEstado_QNAME = new QName("http://entity.grepcepws.com/xsd", "estado");
    private final static QName _CepCep_QNAME = new QName("http://entity.grepcepws.com/xsd", "cep");
    private final static QName _CepCidade_QNAME = new QName("http://entity.grepcepws.com/xsd", "cidade");
    private final static QName _CepBairro_QNAME = new QName("http://entity.grepcepws.com/xsd", "bairro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.grepcepws.entity.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObterCepResponse }
     * 
     */
    public ObterCepResponse createObterCepResponse() {
        return new ObterCepResponse();
    }

    /**
     * Create an instance of {@link Cep }
     * 
     */
    public Cep createCep() {
        return new Cep();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "responseDescription", scope = ObterCepResponse.class)
    public JAXBElement<String> createObterCepResponseResponseDescription(String value) {
        return new JAXBElement<String>(_ObterCepResponseResponseDescription_QNAME, String.class, ObterCepResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "responseCode", scope = ObterCepResponse.class)
    public JAXBElement<String> createObterCepResponseResponseCode(String value) {
        return new JAXBElement<String>(_ObterCepResponseResponseCode_QNAME, String.class, ObterCepResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "transactionId", scope = ObterCepResponse.class)
    public JAXBElement<String> createObterCepResponseTransactionId(String value) {
        return new JAXBElement<String>(_ObterCepResponseTransactionId_QNAME, String.class, ObterCepResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "logradouro", scope = Cep.class)
    public JAXBElement<String> createCepLogradouro(String value) {
        return new JAXBElement<String>(_CepLogradouro_QNAME, String.class, Cep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "regiao", scope = Cep.class)
    public JAXBElement<String> createCepRegiao(String value) {
        return new JAXBElement<String>(_CepRegiao_QNAME, String.class, Cep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "latitude", scope = Cep.class)
    public JAXBElement<String> createCepLatitude(String value) {
        return new JAXBElement<String>(_CepLatitude_QNAME, String.class, Cep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "longitude", scope = Cep.class)
    public JAXBElement<String> createCepLongitude(String value) {
        return new JAXBElement<String>(_CepLongitude_QNAME, String.class, Cep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "id", scope = Cep.class)
    public JAXBElement<String> createCepId(String value) {
        return new JAXBElement<String>(_CepId_QNAME, String.class, Cep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "estado", scope = Cep.class)
    public JAXBElement<String> createCepEstado(String value) {
        return new JAXBElement<String>(_CepEstado_QNAME, String.class, Cep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "cep", scope = Cep.class)
    public JAXBElement<String> createCepCep(String value) {
        return new JAXBElement<String>(_CepCep_QNAME, String.class, Cep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "cidade", scope = Cep.class)
    public JAXBElement<String> createCepCidade(String value) {
        return new JAXBElement<String>(_CepCidade_QNAME, String.class, Cep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.grepcepws.com/xsd", name = "bairro", scope = Cep.class)
    public JAXBElement<String> createCepBairro(String value) {
        return new JAXBElement<String>(_CepBairro_QNAME, String.class, Cep.class, value);
    }

}
