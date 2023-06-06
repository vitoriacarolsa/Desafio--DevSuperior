package com.devsuperior.aulaid.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aulaid.entidades.Pedido;

@Service
public class ServiceEntrega {
	

	public double envio(Pedido pedido) {
		if (pedido.getValorBasico()<=100) {
			return 20.0;
		}
		
		else if (pedido.getValorBasico()>=100 && pedido.getValorBasico()<=200) {
			return 12.0;
		}
		else {
			return 0;
		}
	}
	}
