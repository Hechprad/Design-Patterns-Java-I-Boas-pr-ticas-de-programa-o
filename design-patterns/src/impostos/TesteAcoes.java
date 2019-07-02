package impostos;

public class TesteAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Caelum")
				.comCnpj("123")
				.com(new ItemDaNota("nome 1", 100))
				.com(new ItemDaNota("nome 2", 200))
				.com(new ItemDaNota("nome 3", 300))
				.comObservacoes("obs")
				.constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
