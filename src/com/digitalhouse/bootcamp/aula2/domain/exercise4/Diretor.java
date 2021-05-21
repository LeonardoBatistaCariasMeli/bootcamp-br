package com.digitalhouse.bootcamp.aula2.domain.exercise4;

public class Diretor extends Funcionario implements CLT {

	private double enterpriseProfit;
	
	public Diretor(String name, double salary, double workedHour, double enterpriseProfit) {
		super(name, salary, salary, "Diretor", workedHour);
		this.enterpriseProfit = enterpriseProfit;
	}

	@Override
	public void getBonification() {
		this.salary += this.enterpriseProfit * 0.03;
	}
	
	
	@Override
	public void realizePayment() {
		System.out.println("O funcionário " + this.name + ", vai receber R$: " + this.salary);
		this.salary = this.baseSalary;
	}

	@Override
	public void printEmployeeData() {
		System.out.println("Nome: " + this.name + ", R$: " + this.salary + ", Cargo: " + this.occupation
				+ ", Horas trabalhadas: " + workedHour);
	}

	public void setEnterpriseProfit(double enterpriseProfit) {
		this.enterpriseProfit = enterpriseProfit;
	}
	
}