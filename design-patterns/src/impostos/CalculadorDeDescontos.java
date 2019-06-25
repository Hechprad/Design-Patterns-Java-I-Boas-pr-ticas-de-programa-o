package impostos;

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		// mais de 5 itens, desconto!
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		
		// segunda regra
		if(orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.7;
		}
		
		// em caso contrário...
		return 0;
	}
}
