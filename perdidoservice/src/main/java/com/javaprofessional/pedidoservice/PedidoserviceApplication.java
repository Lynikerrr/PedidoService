package com.javaprofessional.pedidoservice;

import com.javaprofessional.pedidoservice.entity.Pedido;
import com.javaprofessional.pedidoservice.services.FreteService;
import com.javaprofessional.pedidoservice.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PedidoserviceApplication implements CommandLineRunner {
	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private FreteService freteService;

	public static void main(String[] args) {
		SpringApplication.run(PedidoserviceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		Pedido pedido = new Pedido();

		System.out.println("============================================================");
		System.out.println("============ Seja Bem vindo ao PedidoService! ==============");
		System.out.println("============================================================");
		System.out.println();
		System.out.println("============================================================");
		System.out.println("=============== Digite o numero do pedido: =================");
		System.out.println("============================================================");
		int numPedido = sc.nextInt();
		pedido.setCodigo(numPedido);
		System.out.println("============================================================");
		System.out.println("================ Digite o valor do pedido: =================");
		System.out.println("============================================================");
		double valorPedido = sc.nextDouble();
		pedido.setValor(valorPedido);
		System.out.println();
		System.out.println("============================================================");
		System.out.println("================ Digite o valor do desconto: ===============");
		System.out.println("============================================================");
		double descPedido = sc.nextDouble();
		pedido.setDesconto(descPedido);

		double valorFinalPedido = pedidoService.valorFinal(pedido);
		double valorFrete = freteService.valorFrete(pedido.getValor());

		System.out.println("============================================================");
		System.out.println("================ Valor Final do Pedido: ====================");
		System.out.println("============================================================");
		System.out.printf("Valor Final: %.2f\n", valorFinalPedido);
		System.out.printf("Frete: %.2f\n", valorFrete);
		System.out.printf("Total com Frete: %.2f\n", valorFinalPedido + valorFrete);

	}
}
