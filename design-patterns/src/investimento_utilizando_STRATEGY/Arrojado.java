package investimento_utilizando_STRATEGY;

import java.util.Random;

public class Arrojado implements Investimento {
	private Random random = new Random();
	
	@Override
	public double calcula(Double saldo) {
		int chance = random.nextInt(10);
		if(chance >= 0 && chance <= 1) {
			return saldo * 0.05;
		} else if(chance >= 2 && chance <= 4) {
			return saldo * 0.03;
		} else return saldo * 0.006;
	}

}
