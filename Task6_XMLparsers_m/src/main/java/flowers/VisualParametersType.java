
package flowers;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for visual_parametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="visual_parametersType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="stem_color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leaves_color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="average_height" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visual_parametersType", propOrder = {
    "value"
})
public class VisualParametersType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "stem_color")
    protected String stemColor;
    @XmlAttribute(name = "leaves_color")
    protected String leavesColor;
    @XmlAttribute(name = "average_height")
    protected BigInteger averageHeight;

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
     * Gets the value of the stemColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStemColor() {
        return stemColor;
    }

    /**
     * Sets the value of the stemColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStemColor(String value) {
        this.stemColor = value;
    }

    /**
     * Gets the value of the leavesColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeavesColor() {
        return leavesColor;
    }

    /**
     * Sets the value of the leavesColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeavesColor(String value) {
        this.leavesColor = value;
    }

    /**
     * Gets the value of the averageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageHeight() {
        return averageHeight;
    }

    /**
     * Sets the value of the averageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageHeight(BigInteger value) {
        this.averageHeight = value;
    }

}
