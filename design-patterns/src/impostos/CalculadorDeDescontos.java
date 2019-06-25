package impostos;

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento, Desconto descontoQualquer) {
		double desconto = new DescontoPorCincoItens().desconta(orcamento);
		if(desconto == 0) desconto = new DescontoPorMaisDeQuinhentosReais().desconta(orcamento);
		// if desconto == 0 desconto = new ProximoDesconto...
		
		// em caso contrário...
		return 0;
	}
}
