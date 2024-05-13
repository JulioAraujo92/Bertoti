package com.example;

public class Produto {

	private String codigoBarra;
	private Caracteristica caract;

	public Produto(String codigoBarra, Caracteristica caract) {
		this.codigoBarra = codigoBarra;
		this.caract = caract;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String novoCodigoBarra) {
		codigoBarra = novoCodigoBarra;
	}

	public Caracteristica getCaract() {
		return caract;
	}

	public void setCaract(Caracteristica caract) {
		this.caract = caract;
	}

}