package impostos;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum Ensino e Inova��o")
		.comCnpj("99.888.777/0001-33")
		.comItem(new ItemDaNota("item 1", 200.0))
		.comItem(new ItemDaNota("item 2", 300.0))
		.comItem(new ItemDaNota("item 3", 400.0))
		.comObservacoes("obs qualquer.")
		.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getRazaoSocial());

	}

}
