package com.digitalhouse.bootcamp.aula3.domain;

import com.digitalhouse.bootcamp.aula3.domain.interfaces.Precedente;

public class Celular implements Precedente<Celular>{

	private String number;
	private String holder;
	
	public Celular() {
		
	}
	
	public Celular(String number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	@Override
	public boolean precedeA(Celular p) {
		int result = this.holder.compareToIgnoreCase(p.getHolder());

		return result < 0; 
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
}
