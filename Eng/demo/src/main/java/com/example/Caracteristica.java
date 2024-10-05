package com.example;

public class Caracteristica {

	private String marca;
	private String nome;
	private String departamento;

	public Caracteristica(String marca, String nome, String departamento) {
		this.marca = marca;
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String novoDepartamento) {
		this.departamento = novoDepartamento;
	}

	public boolean comparar(Caracteristica caracteristica) {
		if (this.marca.equals(caracteristica.marca) && this.nome.equals(caracteristica.nome)
				&& this.departamento.equals(caracteristica.departamento)) {
			return true;
		} else {
			return false;
		}
	}

}