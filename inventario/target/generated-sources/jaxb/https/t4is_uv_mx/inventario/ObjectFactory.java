//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.14 a las 05:01:35 PM CDT 
//


package https.t4is_uv_mx.inventario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.inventario package. 
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

    private final static QName _BuscarInventarioRequest_QNAME = new QName("https://t4is.uv.mx/inventario", "BuscarInventarioRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.inventario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarInventarioResponse }
     * 
     */
    public BuscarInventarioResponse createBuscarInventarioResponse() {
        return new BuscarInventarioResponse();
    }

    /**
     * Create an instance of {@link InventarioRequest }
     * 
     */
    public InventarioRequest createInventarioRequest() {
        return new InventarioRequest();
    }

    /**
     * Create an instance of {@link InventarioResponse }
     * 
     */
    public InventarioResponse createInventarioResponse() {
        return new InventarioResponse();
    }

    /**
     * Create an instance of {@link BuscarInventarioResponse.Inventario }
     * 
     */
    public BuscarInventarioResponse.Inventario createBuscarInventarioResponseInventario() {
        return new BuscarInventarioResponse.Inventario();
    }

    /**
     * Create an instance of {@link ModificarInventarioRequest }
     * 
     */
    public ModificarInventarioRequest createModificarInventarioRequest() {
        return new ModificarInventarioRequest();
    }

    /**
     * Create an instance of {@link ModificarInventarioResponse }
     * 
     */
    public ModificarInventarioResponse createModificarInventarioResponse() {
        return new ModificarInventarioResponse();
    }

    /**
     * Create an instance of {@link BorrarInventarioRequest }
     * 
     */
    public BorrarInventarioRequest createBorrarInventarioRequest() {
        return new BorrarInventarioRequest();
    }

    /**
     * Create an instance of {@link BorrarInventarioResponse }
     * 
     */
    public BorrarInventarioResponse createBorrarInventarioResponse() {
        return new BorrarInventarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/inventario", name = "BuscarInventarioRequest")
    public JAXBElement<Object> createBuscarInventarioRequest(Object value) {
        return new JAXBElement<Object>(_BuscarInventarioRequest_QNAME, Object.class, null, value);
    }

}
