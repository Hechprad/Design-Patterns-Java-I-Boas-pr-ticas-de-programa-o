package Exercicio_STRATEGY_investimento;

public class RealizadorDeInvestimentos {

	public void realizaInvestimento(ContaBancaria conta, Investimento investimentoQualquer) {
		double investimentoSemImposto = investimentoQualquer.calcula(conta.getSaldo()) * 0.75;
		System.out.println(investimentoSemImposto);
	}
}
