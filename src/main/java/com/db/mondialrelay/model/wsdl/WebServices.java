
package com.db.mondialrelay.model.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "Web_Services", targetNamespace = "http://www.mondialrelay.fr/webservice/", wsdlLocation = "https://api.mondialrelay.com/Web_Services.asmx?WSDL")
public class WebServices
    extends Service
{

    private final static URL WEBSERVICES_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICES_EXCEPTION;
    private final static QName WEBSERVICES_QNAME = new QName("http://www.mondialrelay.fr/webservice/", "Web_Services");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://api.mondialrelay.com/Web_Services.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICES_WSDL_LOCATION = url;
        WEBSERVICES_EXCEPTION = e;
    }

    public WebServices() {
        super(__getWsdlLocation(), WEBSERVICES_QNAME);
    }

    public WebServices(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICES_QNAME, features);
    }

    public WebServices(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICES_QNAME);
    }

    public WebServices(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICES_QNAME, features);
    }

    public WebServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServices(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServicesSoap
     */
    @WebEndpoint(name = "Web_ServicesSoap")
    public WebServicesSoap getWebServicesSoap() {
        return super.getPort(new QName("http://www.mondialrelay.fr/webservice/", "Web_ServicesSoap"), WebServicesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServicesSoap
     */
    @WebEndpoint(name = "Web_ServicesSoap")
    public WebServicesSoap getWebServicesSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.mondialrelay.fr/webservice/", "Web_ServicesSoap"), WebServicesSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WebServicesSoap
     */
    @WebEndpoint(name = "Web_ServicesSoap12")
    public WebServicesSoap getWebServicesSoap12() {
        return super.getPort(new QName("http://www.mondialrelay.fr/webservice/", "Web_ServicesSoap12"), WebServicesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServicesSoap
     */
    @WebEndpoint(name = "Web_ServicesSoap12")
    public WebServicesSoap getWebServicesSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.mondialrelay.fr/webservice/", "Web_ServicesSoap12"), WebServicesSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICES_EXCEPTION!= null) {
            throw WEBSERVICES_EXCEPTION;
        }
        return WEBSERVICES_WSDL_LOCATION;
    }

}
