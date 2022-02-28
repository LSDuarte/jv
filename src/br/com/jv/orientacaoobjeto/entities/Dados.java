package br.com.jv.orientacaoobjeto.entities;

public class Dados {

	private int number;
	private String holder;
	private double depositInitial;

	public Dados() {
	}

	public Dados(int number, String holder, double depositInitial) {
		super();
		this.number = number;
		this.holder = holder;
		this.depositInitial = depositInitial;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getDepositInitial() {
		return depositInitial;
	}

	public void setDepositInitial(double depositInitial) {
		this.depositInitial = depositInitial;
	}

	public String getAccountData() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $" + depositInitial;
	}

	public double updateDeposit(double novoValor) {
		return this.depositInitial + novoValor;
	}

	public double withdrawValue(double novoValor) {
		return this.depositInitial - novoValor - 5;
	}

}