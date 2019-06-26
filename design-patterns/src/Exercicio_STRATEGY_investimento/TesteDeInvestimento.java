package Exercicio_STRATEGY_investimento;

public class TesteDeInvestimento {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(100.0);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		
		RealizadorDeInvestimentos investidor = new RealizadorDeInvestimentos();
		
		investidor.realizaInvestimento(conta, conservador);
		investidor.realizaInvestimento(conta, moderado);
		investidor.realizaInvestimento(conta, arrojado);
	}
	
}
