package Exercicio_STATE_contaBancaria;

public interface EstadoDaConta {

	void saca(Conta conta, double valor);
	void deposita(Conta conta, double valor);
	
}
