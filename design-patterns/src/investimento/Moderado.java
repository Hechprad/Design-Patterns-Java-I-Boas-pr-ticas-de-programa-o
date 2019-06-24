package investimento;

public class Moderado implements Investimento {

	@Override
	public double calcula(Double saldo) {
		boolean random = new java.util.Random().nextDouble() > 0.5;
		if(random == true) {
			return saldo * 0.025;
		} else {
			return saldo * 0.007;
		}
	}

}
