package investimento_utilizando_STRATEGY;

public class Conservador implements Investimento {

	@Override
	public double calcula(Double saldo) {
		return saldo * 0.008;
	}
	
}
