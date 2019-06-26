package impostos;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if(aconteceuVendaCasada(orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.desconta(orcamento);
	}


	public boolean contemItemDeNome(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
	
	public boolean aconteceuVendaCasada(Orcamento orcamento) {
		if(contemItemDeNome("LAPIS", orcamento)
				&& contemItemDeNome("CANETA", orcamento)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
