package com.digitalhouse.bootcamp.aula2.domain.exercise4;

public class Analista extends Funcionario implements CLT {

	public Analista(String name, double salary, double workedHour) {
		super(name, salary, salary, "Analista", workedHour);
	}

	@Override
	public void getBonification() {
		this.salary += this.salary * 0.08;
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

}