package br.unisinos.sistemas.distribuidos.tgb.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.unisinos.sistemas.distribuidos.tgb.service.BhaskaraService;
import br.unisinos.sistemas.distribuidos.tgb.service.SubtractService;
import br.unisinos.sistemas.distribuidos.tgb.service.SumService;
import br.unisinos.xml.calculator.BhaskaraOperationRequest;
import br.unisinos.xml.calculator.BhaskaraOperationResponse;
import br.unisinos.xml.calculator.SubtractOperationRequest;
import br.unisinos.xml.calculator.SubtractOperationResponse;
import br.unisinos.xml.calculator.SumOperationRequest;
import br.unisinos.xml.calculator.SumOperationResponse;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URI = "http://unisinos.br/xml/calculator";

    @Autowired
    private SumService sumService;

    @Autowired
    private SubtractService subtractService;

    @Autowired
    private BhaskaraService bhaskaraService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SumOperationRequest")
    @ResponsePayload
    public SumOperationResponse sum(@RequestPayload final SumOperationRequest request) {
        return sumService.sum(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SubtractOperationRequest")
    @ResponsePayload
    public SubtractOperationResponse subtract(@RequestPayload final SubtractOperationRequest request) {
        return subtractService.subtract(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BhaskaraOperationRequest")
    @ResponsePayload
    public BhaskaraOperationResponse bhaskara(@RequestPayload final BhaskaraOperationRequest request) {
        return bhaskaraService.bhaskara(request);
    }

}
