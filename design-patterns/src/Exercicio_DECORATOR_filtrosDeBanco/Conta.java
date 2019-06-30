package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.Calendar;

public class Conta {
	private double saldo;
	private Calendar dataDeAbertura;
	private String titular;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataDeAbertura = Calendar.getInstance();
	}

	public double getSaldo() {
		return saldo;
	}

	public Calendar getDataDeAbertura() {
		return dataDeAbertura;
	}

	public String getTitular() {
		return titular;
	}
}
