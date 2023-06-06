package com.devsuperior.aulaid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aulaid.entidades.Pedido;

@Service
public class ServicePedido {
	
	@Autowired
	private ServiceEntrega serviceEntrega;
	
	public double total(Pedido pedido) {
	
	double total= pedido.getValorBasico() + serviceEntrega.envio(pedido);
	double totalD =(pedido.getValorBasico()/100)* pedido.getDesconto();
	
	return total-totalD ;
	
	   
	}

}
