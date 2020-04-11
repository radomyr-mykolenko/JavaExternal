
package flowers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flowerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flowerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tulip"/>
 *               &lt;enumeration value="sunflower"/>
 *               &lt;enumeration value="rose"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="soil">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="podzolistaya"/>
 *               &lt;enumeration value="gruntovaya"/>
 *               &lt;enumeration value="dernovo-podzolistaya"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="origin">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Holland"/>
 *               &lt;enumeration value="Ukraine"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="visual_parameters" type="{}visual_parametersType"/>
 *         &lt;element name="growing_tips" type="{}growing_tipsType"/>
 *         &lt;element name="multiplying">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="by leaves"/>
 *               &lt;enumeration value="by cherenki"/>
 *               &lt;enumeration value="by seeds"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowerType", propOrder = {
    "name",
    "soil",
    "origin",
    "visualParameters",
    "growingTips",
    "multiplying"
})
public class FlowerType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String soil;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(name = "visual_parameters", required = true)
    protected VisualParametersType visualParameters;
    @XmlElement(name = "growing_tips", required = true)
    protected GrowingTipsType growingTips;
    @XmlElement(required = true)
    protected String multiplying;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the soil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoil() {
        return soil;
    }

    /**
     * Sets the value of the soil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoil(String value) {
        this.soil = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the visualParameters property.
     * 
     * @return
     *     possible object is
     *     {@link VisualParametersType }
     *     
     */
    public VisualParametersType getVisualParameters() {
        return visualParameters;
    }

    /**
     * Sets the value of the visualParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualParametersType }
     *     
     */
    public void setVisualParameters(VisualParametersType value) {
        this.visualParameters = value;
    }

    /**
     * Gets the value of the growingTips property.
     * 
     * @return
     *     possible object is
     *     {@link GrowingTipsType }
     *     
     */
    public GrowingTipsType getGrowingTips() {
        return growingTips;
    }

    /**
     * Sets the value of the growingTips property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowingTipsType }
     *     
     */
    public void setGrowingTips(GrowingTipsType value) {
        this.growingTips = value;
    }

    /**
     * Gets the value of the multiplying property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplying() {
        return multiplying;
    }

    /**
     * Sets the value of the multiplying property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplying(String value) {
        this.multiplying = value;
    }

}
