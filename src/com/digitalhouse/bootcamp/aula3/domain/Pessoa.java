package com.digitalhouse.bootcamp.aula3.domain;

import com.digitalhouse.bootcamp.aula3.domain.interfaces.Precedente;

public class Pessoa implements Precedente<Pessoa> {

	private String nome;
	private String cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean precedeA(Pessoa p) {
		int result = nome.compareToIgnoreCase(p.getNome());

		return result < 0; 
	}

}
