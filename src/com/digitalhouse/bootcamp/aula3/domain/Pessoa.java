package com.digitalhouse.bootcamp.aula3.domain;

import com.digitalhouse.bootcamp.aula3.domain.interfaces.Precedente;

public class Pessoa implements Precedente<Pessoa, OrderPessoa> {

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
	public boolean precedeA(Pessoa p, OrderPessoa order) {
		int result;

		if (order == null) {
			order = OrderPessoa.nome;
		}

		switch (order) {
			case cpf:
				result = cpf.compareToIgnoreCase(p.getCpf());
				break;

			case nome:
			default:
				result = nome.compareToIgnoreCase(p.getNome());
		}

		return result < 0; 
	}

}
