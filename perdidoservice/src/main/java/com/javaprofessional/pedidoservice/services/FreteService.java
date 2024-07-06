package com.javaprofessional.pedidoservice.services;

import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public double valorFrete(double valorPedido) {
        double frete;
        if (valorPedido < 100.00) {
            frete = 20.00;
        } else if (valorPedido < 200.00) {
            frete = 12.00;
        } else {
            frete = 0.00;
        }
        return frete;
    }

}
