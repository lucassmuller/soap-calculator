package br.unisinos.sistemas.distribuidos.tgb;

import javax.xml.ws.Endpoint;

import br.unisinos.sistemas.distribuidos.tgb.endpoint.CalculatorEndpointImpl;

public class Application {

    private static final String ADDRESS = "http://127.0.0.1:8080/calculator";

    public static void main(String[] args) {
        Endpoint.publish(ADDRESS, new CalculatorEndpointImpl());
        System.out.println("Running on " + ADDRESS);
    }

}
