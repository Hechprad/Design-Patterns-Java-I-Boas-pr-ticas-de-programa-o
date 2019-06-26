package Exercicio_STRATEGY_investimento;

public class Conservador implements Investimento {

	@Override
	public double calcula(Double saldo) {
		return saldo * 0.008;
	}
	
}
