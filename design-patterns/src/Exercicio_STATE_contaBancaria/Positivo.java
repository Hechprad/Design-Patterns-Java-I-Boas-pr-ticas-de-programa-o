package Exercicio_STATE_contaBancaria;

public class Positivo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;
		
		if(conta.saldo < 0) {conta.estadoAtual = new Negativo();}
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

	

}
