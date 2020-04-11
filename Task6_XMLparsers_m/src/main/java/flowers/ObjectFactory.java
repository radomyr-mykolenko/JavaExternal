
package flowers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the flowers package. 
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

    private final static QName _Flowers_QNAME = new QName("", "flowers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: flowers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlowersType }
     * 
     */
    public FlowersType createFlowersType() {
        return new FlowersType();
    }

    /**
     * Create an instance of {@link FlowerType }
     * 
     */
    public FlowerType createFlowerType() {
        return new FlowerType();
    }

    /**
     * Create an instance of {@link VisualParametersType }
     * 
     */
    public VisualParametersType createVisualParametersType() {
        return new VisualParametersType();
    }

    /**
     * Create an instance of {@link GrowingTipsType }
     * 
     */
    public GrowingTipsType createGrowingTipsType() {
        return new GrowingTipsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlowersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowers")
    public JAXBElement<FlowersType> createFlowers(FlowersType value) {
        return new JAXBElement<FlowersType>(_Flowers_QNAME, FlowersType.class, null, value);
    }

}
