package impostos;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {

		CriadorDeNotaFiscal criador = new CriadorDeNotaFiscal();
		criador.paraEmpresa("Caelum Ensino e Inovação");
		criador.comCnpj("99.888.777/0001-33");
		criador.comItem(new ItemDaNota("item 1", 200.0));
		criador.comItem(new ItemDaNota("item 2", 300.0));
		criador.comItem(new ItemDaNota("item 3", 400.0));

	}

}
