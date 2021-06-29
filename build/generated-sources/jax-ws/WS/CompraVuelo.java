
package WS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CompraVuelo", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CompraVuelo {


    /**
     * 
     * @param fecha
     * @param tipo
     * @param origen
     * @param destino
     * @param personas
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CompraVuelo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CompraVuelo", targetNamespace = "http://WS/", className = "WS.CompraVuelo_Type")
    @ResponseWrapper(localName = "CompraVueloResponse", targetNamespace = "http://WS/", className = "WS.CompraVueloResponse")
    @Action(input = "http://WS/CompraVuelo/CompraVueloRequest", output = "http://WS/CompraVuelo/CompraVueloResponse")
    public String compraVuelo(
        @WebParam(name = "origen", targetNamespace = "")
        String origen,
        @WebParam(name = "destino", targetNamespace = "")
        String destino,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "personas", targetNamespace = "")
        String personas,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo);

}