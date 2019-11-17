package br.unisinos.sistemas.distribuidos.tgb.endpoint;

import javax.jws.WebService;

import br.unisinos.sistemas.distribuidos.tgb.request.SimpleCalcRequest;
import br.unisinos.sistemas.distribuidos.tgb.response.SimpleCalcResponse;

@WebService(endpointInterface = "br.unisinos.sistemas.distribuidos.tgb.endpoint.CalculatorEndpoint")
public class CalculatorEndpointImpl implements CalculatorEndpoint {

    public SimpleCalcResponse sum(final SimpleCalcRequest request) {
        return SimpleCalcResponse.builder()
            .result(request.getA() + request.getB())
            .build();
    }

    public SimpleCalcResponse subtract(final SimpleCalcRequest request) {
        return SimpleCalcResponse.builder()
            .result(request.getA() - request.getB())
            .build();
    }

    public SimpleCalcResponse multiply(final SimpleCalcRequest request) {
        return SimpleCalcResponse.builder()
            .result(request.getA() * request.getB())
            .build();
    }

    public SimpleCalcResponse divide(final SimpleCalcRequest request) {
        return SimpleCalcResponse.builder()
            .result(request.getA() / request.getB())
            .build();
    }

}
