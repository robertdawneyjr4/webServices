
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

    private final static QName _RegistroUser_QNAME = new QName("http://WS/", "RegistroUser");
    private final static QName _RegistroUserResponse_QNAME = new QName("http://WS/", "RegistroUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistroUser }
     * 
     */
    public RegistroUser createRegistroUser() {
        return new RegistroUser();
    }

    /**
     * Create an instance of {@link RegistroUserResponse }
     * 
     */
    public RegistroUserResponse createRegistroUserResponse() {
        return new RegistroUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "RegistroUser")
    public JAXBElement<RegistroUser> createRegistroUser(RegistroUser value) {
        return new JAXBElement<RegistroUser>(_RegistroUser_QNAME, RegistroUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "RegistroUserResponse")
    public JAXBElement<RegistroUserResponse> createRegistroUserResponse(RegistroUserResponse value) {
        return new JAXBElement<RegistroUserResponse>(_RegistroUserResponse_QNAME, RegistroUserResponse.class, null, value);
    }

}
