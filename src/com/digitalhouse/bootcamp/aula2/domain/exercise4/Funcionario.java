package com.digitalhouse.bootcamp.aula2.domain.exercise4;

public abstract class Funcionario {

	protected String name;
	protected double baseSalary;
	protected double salary;
	protected String occupation;
	protected double workedHour;

	public Funcionario() {

	}

	public Funcionario(String name, double baseSalary, double salary, String occupation, double workedHour) {
		super();
		this.name = name;
		this.baseSalary = baseSalary;
		this.salary = salary;
		this.occupation = occupation;
		this.workedHour = workedHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(double workedHour) {
		this.workedHour = workedHour;
	}

	public abstract void printEmployeeData();
}
