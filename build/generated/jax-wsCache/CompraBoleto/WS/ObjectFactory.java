
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

    private final static QName _BoletosResponse_QNAME = new QName("http://WS/", "boletosResponse");
    private final static QName _Boletos_QNAME = new QName("http://WS/", "boletos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Boletos }
     * 
     */
    public Boletos createBoletos() {
        return new Boletos();
    }

    /**
     * Create an instance of {@link BoletosResponse }
     * 
     */
    public BoletosResponse createBoletosResponse() {
        return new BoletosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoletosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "boletosResponse")
    public JAXBElement<BoletosResponse> createBoletosResponse(BoletosResponse value) {
        return new JAXBElement<BoletosResponse>(_BoletosResponse_QNAME, BoletosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boletos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "boletos")
    public JAXBElement<Boletos> createBoletos(Boletos value) {
        return new JAXBElement<Boletos>(_Boletos_QNAME, Boletos.class, null, value);
    }

}
