//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.11.02 às 12:10:49 PM BRT 
//


package br.unisinos.xml.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="x1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="x2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "x1",
    "x2"
})
@XmlRootElement(name = "BhaskaraOperationResponse")
public class BhaskaraOperationResponse {

    protected double x1;
    protected double x2;

    /**
     * Obtém o valor da propriedade x1.
     * 
     */
    public double getX1() {
        return x1;
    }

    /**
     * Define o valor da propriedade x1.
     * 
     */
    public void setX1(double value) {
        this.x1 = value;
    }

    /**
     * Obtém o valor da propriedade x2.
     * 
     */
    public double getX2() {
        return x2;
    }

    /**
     * Define o valor da propriedade x2.
     * 
     */
    public void setX2(double value) {
        this.x2 = value;
    }

}
