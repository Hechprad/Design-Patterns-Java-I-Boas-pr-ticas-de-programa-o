package Exercicio_STATE_contaBancaria;

public class Conta {

	protected double saldo;
	protected EstadoDaConta estadoAtual;

	public Conta() {
		estadoAtual = new Positivo();
	}

	public void saca(double valor) {
		estadoAtual.saca(this, valor);
	}
	
	public void deposita(double valor) {
		estadoAtual.deposita(this, valor);
	}
}
