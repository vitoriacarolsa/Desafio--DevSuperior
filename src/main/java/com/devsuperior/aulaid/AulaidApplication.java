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
		Pedido pedido= new Pedido(1034, 150 , 20);
		System.out.println("Código do pedido: " + pedido.getCodigo() );
		System.out.println("Valor total: " + servicePedido.total(pedido));
		
	}

}
