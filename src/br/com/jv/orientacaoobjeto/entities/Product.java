package br.com.jv.orientacaoobjeto.entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// constrututor padrão
	public Product() {
		
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//sobrecarga - disponibilizar mais de uma opção da mesma operação.
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
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
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}