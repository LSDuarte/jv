package br.com.jv.orientacaoobjeto.entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int qtd) {
		this.quantity += qtd;
	}

	public void removeProducts(int qtd) {
		this.quantity -= qtd;
	}

	@Override
	public String toString() {
		return name 
			+ ", $ "
			+ price
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ totalValueInStock();
	}

}