package com.devsuperior.aulaid.entidades;

public class Pedido {
	private Integer codigo;
	private double valorBasico;
	private double desconto;
	
	public Pedido(Integer codigo, double valorBasico, double desconto) {
		this.codigo = codigo;
		this.valorBasico = valorBasico;
		this.desconto = desconto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public double getValorBasico() {
		return valorBasico;
	}

	public void setValorBasico(double valorBasico) {
		this.valorBasico = valorBasico;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	

}

