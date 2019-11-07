package br.unisinos.sistemas.distribuidos.tgb.service;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import org.springframework.stereotype.Service;

import br.unisinos.xml.calculator.BhaskaraOperationRequest;
import br.unisinos.xml.calculator.BhaskaraOperationResponse;

@Service
public class BhaskaraService {

    public BhaskaraOperationResponse bhaskara(final BhaskaraOperationRequest request) {
        final double delta = calcDelta(request);

        if (delta < 0.0) {
            throw new RuntimeException("Delta não possui raiz.");
        }

        final BhaskaraOperationResponse response = new BhaskaraOperationResponse();
        response.setX1(calcX1(request, delta));
        response.setX2(calcX2(request, delta));

        return response;
    }

    private double calcDelta(final BhaskaraOperationRequest request) {
        return pow(request.getB(), 2) + (-4 * request.getA() * request.getC());
    }

    private double calcX1(final BhaskaraOperationRequest request, final double delta) {
        return (-request.getB() + sqrt(delta)) / 2 * request.getA();
    }

    private double calcX2(final BhaskaraOperationRequest request, final double delta) {
        return (-request.getB() - sqrt(delta)) / 2 * request.getA();
    }

}
