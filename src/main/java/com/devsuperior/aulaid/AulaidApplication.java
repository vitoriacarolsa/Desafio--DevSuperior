package com.devsuperior.aulaid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aulaid.entidades.Pedido;
import com.devsuperior.aulaid.services.ServicePedido;

@SpringBootApplication
public class AulaidApplication implements CommandLineRunner  {
	
	
	
	@Autowired
	private ServicePedido servicePedido;
	
	public static void main(String[] args) {
		SpringApplication.run(AulaidApplication.class, args);
	}

	@Override
	
	public void run(String... args) throws Exception {
		
		System.out.println();
		Pedido pedido1= new Pedido(1034, 150 , 20);
		System.out.println("Código do pedido: " + pedido1.getCodigo() );
		System.out.println("Valor total: " + servicePedido.total(pedido1));
		
		System.out.println();
		Pedido pedido2= new Pedido(2282, 800 , 10);
		System.out.println("Código do pedido: " + pedido2.getCodigo() );
		System.out.println("Valor total: " + servicePedido.total(pedido2));
		
		System.out.println();
		Pedido pedido3= new Pedido(1309, 95.90 , 0);
		System.out.println("Código do pedido: " + pedido3.getCodigo() );
		System.out.println("Valor total: " + servicePedido.total(pedido3));
		
	}

}
