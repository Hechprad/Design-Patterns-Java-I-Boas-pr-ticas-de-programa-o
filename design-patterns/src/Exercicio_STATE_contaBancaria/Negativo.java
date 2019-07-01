package Exercicio_STATE_contaBancaria;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Saldo insuficiente, impossivel realizar saque!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		
		if(conta.saldo > 0) {conta.estadoAtual = new Positivo();}
	}

}
