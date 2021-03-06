
package org.tempuri;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmpresaCessa", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:18749/EmpresaCessa.asmx?WSDL")
public class EmpresaCessa
    extends Service
{

    private final static URL EMPRESACESSA_WSDL_LOCATION;
    private final static WebServiceException EMPRESACESSA_EXCEPTION;
    private final static QName EMPRESACESSA_QNAME = new QName("http://tempuri.org/", "EmpresaCessa");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:18749/EmpresaCessa.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPRESACESSA_WSDL_LOCATION = url;
        EMPRESACESSA_EXCEPTION = e;
    }

    public EmpresaCessa() {
        super(__getWsdlLocation(), EMPRESACESSA_QNAME);
    }

    public EmpresaCessa(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPRESACESSA_QNAME, features);
    }

    public EmpresaCessa(URL wsdlLocation) {
        super(wsdlLocation, EMPRESACESSA_QNAME);
    }

    public EmpresaCessa(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPRESACESSA_QNAME, features);
    }

    public EmpresaCessa(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpresaCessa(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmpresaCessaSoap
     */
    @WebEndpoint(name = "EmpresaCessaSoap")
    public EmpresaCessaSoap getEmpresaCessaSoap() {
        return super.getPort(new QName("http://tempuri.org/", "EmpresaCessaSoap"), EmpresaCessaSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpresaCessaSoap
     */
    @WebEndpoint(name = "EmpresaCessaSoap")
    public EmpresaCessaSoap getEmpresaCessaSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "EmpresaCessaSoap"), EmpresaCessaSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns EmpresaCessaSoap
     */
    @WebEndpoint(name = "EmpresaCessaSoap12")
    public EmpresaCessaSoap getEmpresaCessaSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "EmpresaCessaSoap12"), EmpresaCessaSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpresaCessaSoap
     */
    @WebEndpoint(name = "EmpresaCessaSoap12")
    public EmpresaCessaSoap getEmpresaCessaSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "EmpresaCessaSoap12"), EmpresaCessaSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPRESACESSA_EXCEPTION!= null) {
            throw EMPRESACESSA_EXCEPTION;
        }
        return EMPRESACESSA_WSDL_LOCATION;
    }

}
