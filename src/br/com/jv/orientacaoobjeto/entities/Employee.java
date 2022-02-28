package br.com.jv.orientacaoobjeto.entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return this.grossSalary + increaseSalary(tax);
	}

	public double increaseSalary(double percentage) {
		return (percentage * this.grossSalary);
	}

}