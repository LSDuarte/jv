package br.com.jv.estruturasequencial;

public class Casting3 {
	public static void main(String[] args) {
		double b, B, c, h, area;

		b = 6.0; // .0 pra indicar que é do tipo doble, boa praticas.
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.println(area);
		System.out.println("--------------------");

		int a=5, bb=2;
		double resultado1;
		double resultado2;

		resultado1 = a / bb;
		resultado2 = (double) a / bb; //casting

		System.out.println(resultado1);
		System.out.println(resultado2);
		
		System.out.println("--------------------");

		double aa;
		int bbb;
		
		aa = 5.0;
		//bbb = aa; da erro 
		bbb = (int) aa;
		
		System.out.println(bbb);

	}
}