
package WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS package. 
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

    private final static QName _CompraBoleto_QNAME = new QName("http://WS/", "CompraBoleto");
    private final static QName _CompraBoletoResponse_QNAME = new QName("http://WS/", "CompraBoletoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompraBoletoResponse }
     * 
     */
    public CompraBoletoResponse createCompraBoletoResponse() {
        return new CompraBoletoResponse();
    }

    /**
     * Create an instance of {@link CompraBoleto_Type }
     * 
     */
    public CompraBoleto_Type createCompraBoleto_Type() {
        return new CompraBoleto_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraBoleto_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "CompraBoleto")
    public JAXBElement<CompraBoleto_Type> createCompraBoleto(CompraBoleto_Type value) {
        return new JAXBElement<CompraBoleto_Type>(_CompraBoleto_QNAME, CompraBoleto_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraBoletoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "CompraBoletoResponse")
    public JAXBElement<CompraBoletoResponse> createCompraBoletoResponse(CompraBoletoResponse value) {
        return new JAXBElement<CompraBoletoResponse>(_CompraBoletoResponse_QNAME, CompraBoletoResponse.class, null, value);
    }

}
