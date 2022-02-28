package br.com.jv.orientacaoobjeto;

import java.util.Locale;
import java.util.Scanner;

import br.com.jv.orientacaoobjeto.entities.Employee;

public class ProgramEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.println("Informe os dados: ");
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.grossSalary = sc.nextDouble();
		
		sc.close();
	}
}