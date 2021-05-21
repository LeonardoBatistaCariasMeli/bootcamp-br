package com.digitalhouse.bootcamp.aula2.domain.exercise4;

public class Tecnico extends Funcionario implements CLT {

	public Tecnico(String name, double salary, double workedHour) {
		super(name, salary, salary, "Tecnico", workedHour);
	}

	@Override
	public void getBonification() {
		this.salary += this.salary * 0.05;
	}

	@Override
	public void realizePayment() {
		System.out.println("O funcionário " + this.name + ", vai receber R$: " + this.salary);
		this.salary = this.baseSalary;
	}

	@Override
	public void printEmployeeData() {
		System.out.println("Nome: " + this.name + ", salário base R$: " + this.salary + ", Cargo: " + this.occupation
				+ ", Horas trabalhadas: " + workedHour);
	}

}
