package br.unisinos.sistemas.distribuidos.tgb.service;

import org.springframework.stereotype.Service;

import br.unisinos.xml.calculator.SumOperationRequest;
import br.unisinos.xml.calculator.SumOperationResponse;

@Service
public class SumService {

    public SumOperationResponse sum(final SumOperationRequest request) {
        final SumOperationResponse response = new SumOperationResponse();
        response.setResult(request.getA() + request.getB());

        return response;
    }

}
