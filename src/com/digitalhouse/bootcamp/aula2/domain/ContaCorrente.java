package com.digitalhouse.bootcamp.aula2.domain;

public class ContaCorrente {

	private double balance;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(double balance) {
		this.balance = balance;
	}
	
	public ContaCorrente(ContaCorrente contaCorrente) {
		this.balance = contaCorrente.getBalance();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double depositValue) {
		this.balance += depositValue;
		System.out.println("The value R$:" + depositValue + " has been deposited. Total is R$:" + this.balance);
	}
	
	public void withDraw(double value) {
		this.balance -= value;
		System.out.println("The value R$:" + value + " has been withdraw. Total is R$:" + this.balance);
	}
	
	public void devolution(double value) {
		this.balance += value;
		System.out.println("The value R$:" + value + " has been returned. Total is R$:" + this.balance);
	}
	
	public void transfer(double value) {
		this.balance -= value;
		System.out.println("The value R$:" + value + " has been transferred. Total is R$:" + this.balance);
	}

	
}
