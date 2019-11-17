package br.unisinos.sistemas.distribuidos.tgb.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.unisinos.sistemas.distribuidos.tgb.request.SimpleCalcRequest;
import br.unisinos.sistemas.distribuidos.tgb.response.SimpleCalcResponse;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculatorEndpoint {

    @WebMethod
    SimpleCalcResponse sum(final SimpleCalcRequest request);

    @WebMethod
    SimpleCalcResponse subtract(final SimpleCalcRequest request);

    @WebMethod
    SimpleCalcResponse multiply(final SimpleCalcRequest request);

    @WebMethod
    SimpleCalcResponse divide(final SimpleCalcRequest request);

}
