package br.unisinos.sistemas.distribuidos.tgb.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SimpleCalcResponse {

    private Double result;

}
