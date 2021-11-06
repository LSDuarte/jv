package br.com.jv.estruturasequencial;

import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char x;

		x = sc.next().charAt(0);  // le o caracter, e pega a primeira letra do que foi escrito.
		System.out.println(x);

	}

}