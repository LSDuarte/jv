package br.com.jv.estruturasequencial;

import java.util.Locale;

public class OperacoesBasicas {

	public static void main(String[] args) {
		
		/*Entrada, processamento e Saida de dados.*/
		
		System.out.println("Olá mundo!");
		
		System.out.println("Bom dia!");
		System.out.print("Bom dia!");
		
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.println("Bom dia!");
		
		System.out.println("----------------------------");
		System.out.printf("%.1f%n", x);
		System.out.printf("%.2f%n", x); /*formatando qtd de casas decimais*/
		System.out.printf("%.4f%n", x);
		
		System.out.println("----------------------------");
		Locale.setDefault(Locale.US); /* necessario configurar o programa para us - para ficar com .*/
		System.out.printf("%.4f%n", x); 
		
		System.out.println("----------------------------");
		System.out.println("Resultado " + x + " Metros"); /*Concatenando informações*/
		
		System.out.println("----------------------------");
		System.out.printf("Resultado = %.2f Metros%n", x); /*Concatenando informações e formatando casas decimais*/
	}
	
}