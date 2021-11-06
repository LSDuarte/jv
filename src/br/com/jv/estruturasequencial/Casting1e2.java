package br.com.jv.estruturasequencial;

public class Casting1e2 {

	public static void main(String[] args) {
		
		int x, y;
		x = 5;
		y = 2*x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("----------------");
		
		int xx;
		double yy;
		xx = 5;
		yy = 2*x; // castring para double pois variavel yy é do tipo double. 
		
		System.out.println(xx);
		System.out.println(yy);
		
	}
	
}