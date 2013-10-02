
package com.grepcepws.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GrepCep", targetNamespace = "http://ws.grepcepws.com", wsdlLocation = "http://webservice.grepcep.com/GrepCepWS/services/GrepCep?wsdl")
public class GrepCep
    extends Service
{

    private final static URL GREPCEP_WSDL_LOCATION;
    private final static WebServiceException GREPCEP_EXCEPTION;
    private final static QName GREPCEP_QNAME = new QName("http://ws.grepcepws.com", "GrepCep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservice.grepcep.com/GrepCepWS/services/GrepCep?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GREPCEP_WSDL_LOCATION = url;
        GREPCEP_EXCEPTION = e;
    }

    public GrepCep() {
        super(__getWsdlLocation(), GREPCEP_QNAME);
    }

    public GrepCep(WebServiceFeature... features) {
        super(__getWsdlLocation(), GREPCEP_QNAME, features);
    }

    public GrepCep(URL wsdlLocation) {
        super(wsdlLocation, GREPCEP_QNAME);
    }

    public GrepCep(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GREPCEP_QNAME, features);
    }

    public GrepCep(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GrepCep(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GrepCepPortType
     */
    @WebEndpoint(name = "GrepCepHttpSoap11Endpoint")
    public GrepCepPortType getGrepCepHttpSoap11Endpoint() {
        return super.getPort(new QName("http://ws.grepcepws.com", "GrepCepHttpSoap11Endpoint"), GrepCepPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GrepCepPortType
     */
    @WebEndpoint(name = "GrepCepHttpSoap11Endpoint")
    public GrepCepPortType getGrepCepHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.grepcepws.com", "GrepCepHttpSoap11Endpoint"), GrepCepPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GREPCEP_EXCEPTION!= null) {
            throw GREPCEP_EXCEPTION;
        }
        return GREPCEP_WSDL_LOCATION;
    }

}
