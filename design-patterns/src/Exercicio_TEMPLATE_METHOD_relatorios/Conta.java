package Exercicio_TEMPLATE_METHOD_relatorios;

public class Conta {
	private String titular;
	private String agencia;
	private int numeroDaConta;
	private double saldo;
	
	public Conta(String titular, String agencia, int numeroDaConta, double saldo) {
		this.titular = titular;
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
}
