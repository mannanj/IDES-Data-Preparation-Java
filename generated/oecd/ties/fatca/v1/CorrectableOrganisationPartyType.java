//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.07 at 07:17:25 PM EST 
//


package oecd.ties.fatca.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oecd.ties.stffatcatypes.v1.OrganisationPartyType;


/**
 * <p>Java class for CorrectableOrganisationParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectableOrganisationParty_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oecd:ties:stffatcatypes:v1}OrganisationParty_Type">
 *       &lt;sequence>
 *         &lt;element name="DocSpec" type="{urn:oecd:ties:fatca:v1}DocSpec_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectableOrganisationParty_Type", propOrder = {
    "docSpec"
})
public class CorrectableOrganisationPartyType
    extends OrganisationPartyType
{

    @XmlElement(name = "DocSpec", required = true)
    protected DocSpecType docSpec;

    /**
     * Gets the value of the docSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DocSpecType }
     *     
     */
    public DocSpecType getDocSpec() {
        return docSpec;
    }

    /**
     * Sets the value of the docSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSpecType }
     *     
     */
    public void setDocSpec(DocSpecType value) {
        this.docSpec = value;
    }

}