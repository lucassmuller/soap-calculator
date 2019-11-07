package br.unisinos.sistemas.distribuidos.tgb.service;

import org.springframework.stereotype.Service;

import br.unisinos.xml.calculator.SubtractOperationRequest;
import br.unisinos.xml.calculator.SubtractOperationResponse;

@Service
public class SubtractService {

    public SubtractOperationResponse subtract(final SubtractOperationRequest request) {
        final SubtractOperationResponse response = new SubtractOperationResponse();
        response.setResult(request.getA() - request.getB());

        return response;
    }

}
