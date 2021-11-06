package br.com.jv.estruturasequencial;

public class Concatenacoes {
	
	/*
	 *   %f  >> ponto flutuante
	 *   %d  >> inteiro
	 *   %s  >> texto
	 *   %n  >> quebra de linha 
	 * 
	 * */

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;

		System.out.println("----------------------------");
		System.out.println("Resultado " + x + " Metros"); /* Concatenando informações */

		System.out.println("----------------------------");
		System.out.printf("Resultado = %.2f Metros%n", x); /* Concatenando informações e formatando casas decimais */
		
		System.out.println("----------------------------");
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);	
	}

}