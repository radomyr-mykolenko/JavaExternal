
package flowers;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for growing_tipsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="growing_tipsType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="temperature" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="lightening" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="watering" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "growing_tipsType", propOrder = {
    "value"
})
public class GrowingTipsType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "temperature")
    protected BigInteger temperature;
    @XmlAttribute(name = "lightening")
    protected Boolean lightening;
    @XmlAttribute(name = "watering")
    protected BigInteger watering;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTemperature(BigInteger value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the lightening property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLightening() {
        return lightening;
    }

    /**
     * Sets the value of the lightening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLightening(Boolean value) {
        this.lightening = value;
    }

    /**
     * Gets the value of the watering property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWatering() {
        return watering;
    }

    /**
     * Sets the value of the watering property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWatering(BigInteger value) {
        this.watering = value;
    }

}
