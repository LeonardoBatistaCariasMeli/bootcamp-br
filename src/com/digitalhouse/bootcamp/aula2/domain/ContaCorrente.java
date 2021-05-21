package com.digitalhouse.bootcamp.aula2.domain;

public class ContaCorrente {

	private int account;
	private int agency;
	private String nameOwner;
	private double balance;
	
	public ContaCorrente() {
		
	}
	
	
	public ContaCorrente(int account, int agency, String nameOwner, double balance) {
		this.account = account;
		this.agency = agency;
		this.nameOwner = nameOwner;
		this.balance = balance;
	}


	public ContaCorrente(ContaCorrente contaCorrente) {
		this.account = contaCorrente.getAccount();
		this.agency = contaCorrente.getAgency();
		this.nameOwner = contaCorrente.getNameOwner();
		this.balance = contaCorrente.getBalance();
	}
	
	
	public int getAccount() {
		return account;
	}


	public void setAccount(int account) {
		this.account = account;
	}


	public int getAgency() {
		return agency;
	}


	public void setAgency(int agency) {
		this.agency = agency;
	}


	public String getNameOwner() {
		return nameOwner;
	}


	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
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
	
	public void total() {
		System.out.println("The account has the total of R$:" + this.balance);
	}

	
}
