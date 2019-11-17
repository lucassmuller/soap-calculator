package br.unisinos.sistemas.distribuidos.tgb.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleCalcRequest {

    @XmlElement(required = true)
    private Double a;

    @XmlElement(required = true)
    private Double b;

}
