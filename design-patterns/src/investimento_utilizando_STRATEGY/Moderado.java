package investimento_utilizando_STRATEGY;

import java.util.Random;

public class Moderado implements Investimento {
	private Random random = new Random();
	
	@Override
	public double calcula(Double saldo) {
		int chance = random.nextInt(2);
		if(chance == 1) {
			return saldo * 0.025;
		} else {
			return saldo * 0.007;
		}
	}

}
