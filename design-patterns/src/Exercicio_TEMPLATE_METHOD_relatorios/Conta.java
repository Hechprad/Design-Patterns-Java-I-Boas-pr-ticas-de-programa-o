package Exercicio_TEMPLATE_METHOD_relatorios;

public class Conta {
	private String titular;
	private String agencia;
	private String numeroDaConta;
	private double saldo;
	
	public Conta(String titular, String agencia, String numeroDaConta, double saldo) {
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
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
}
