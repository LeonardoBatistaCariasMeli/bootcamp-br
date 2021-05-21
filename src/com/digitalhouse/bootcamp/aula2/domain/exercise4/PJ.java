package com.digitalhouse.bootcamp.aula2.domain.exercise4;

public class PJ extends Funcionario {

	private double hourPayment;

	public PJ(String name, int workedHour, String occupation, double hourPayment) {
		super(name, 0, paymentCalculator(workedHour, hourPayment), occupation, workedHour);
	}

	@Override
	public void printEmployeeData() {
		System.out.println("Nome: " + this.name + ", R$: " + this.salary + ", Cargo: " + this.occupation
				+ ", Horas trabalhadas: " + workedHour);
	}

	private static double paymentCalculator(int workedHour, double hourPayment) {
		return hourPayment * workedHour;
	}

	public double getHourPayment() {
		return hourPayment;
	}

	public void setHourPayment(double hourPayment) {
		this.hourPayment = hourPayment;
	}
}
