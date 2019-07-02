package impostos;

import java.util.Calendar;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {

		ItemDaNotaBuilder itemBuilder = new ItemDaNotaBuilder();
		itemBuilder.comNome("ITEM 1").comValor(500.0);
		ItemDaNota item = itemBuilder.constroi();
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum Ensino e Inova��o")
		.comCnpj("99.888.777/0001-33")
		.com(item)
		.com(new ItemDaNota("item 1", 200.0))
		.com(new ItemDaNota("item 2", 300.0))
		.com(new ItemDaNota("item 3", 400.0))
		.comObservacoes("obs qualquer.")
		.naData(Calendar.getInstance());
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());

	}

}
