package impostos;

public class DescontoPorMaisDeQuinhentosReais {

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.7;
		}
		return 0;
	}
}
