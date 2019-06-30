package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.Calendar;
import java.util.Date;

public class Conta {
	private double saldo;
	private Date dataDeAbertura;
	private String titular;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataDeAbertura = Calendar.getInstance().getTime();
	}

	public double getSaldo() {
		return saldo;
	}

	public Date getDataDeAbertura() {
		return dataDeAbertura;
	}

	public String getTitular() {
		return titular;
	}
}
