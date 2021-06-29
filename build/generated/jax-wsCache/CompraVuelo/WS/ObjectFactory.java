
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

    private final static QName _CompraVuelo_QNAME = new QName("http://WS/", "CompraVuelo");
    private final static QName _CompraVueloResponse_QNAME = new QName("http://WS/", "CompraVueloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompraVuelo_Type }
     * 
     */
    public CompraVuelo_Type createCompraVuelo_Type() {
        return new CompraVuelo_Type();
    }

    /**
     * Create an instance of {@link CompraVueloResponse }
     * 
     */
    public CompraVueloResponse createCompraVueloResponse() {
        return new CompraVueloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraVuelo_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "CompraVuelo")
    public JAXBElement<CompraVuelo_Type> createCompraVuelo(CompraVuelo_Type value) {
        return new JAXBElement<CompraVuelo_Type>(_CompraVuelo_QNAME, CompraVuelo_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraVueloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "CompraVueloResponse")
    public JAXBElement<CompraVueloResponse> createCompraVueloResponse(CompraVueloResponse value) {
        return new JAXBElement<CompraVueloResponse>(_CompraVueloResponse_QNAME, CompraVueloResponse.class, null, value);
    }

}
