package investimento;

public class TesteDeInvestimento {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(100.0);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		
		RealizadorDeInvestimentos investidor = new RealizadorDeInvestimentos();
		
		investidor.realizaInvestimento(conta, conservador);
		investidor.realizaInvestimento(conta, moderado);
	}
	
}
