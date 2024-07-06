package com.javaprofessional.pedidoservice.services;

import com.javaprofessional.pedidoservice.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private FreteService freteService;

    public static double valorFinal(Pedido pedido){
        double valorCDesc = pedido.getValor() *(1 - pedido.getDesconto() / 100);
        return valorCDesc;
    }

}
