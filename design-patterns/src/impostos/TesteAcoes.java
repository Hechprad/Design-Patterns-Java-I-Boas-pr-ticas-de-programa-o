package impostos;

import java.util.ArrayList;
import java.util.List;

public class TesteAcoes {

	public static void main(String[] args) {
		
		List<AcaoAposGerarNota> lista = new ArrayList<AcaoAposGerarNota>();
		lista.add(new EnviadorDeEmail());
		lista.add(new NotaFiscalDao());
		lista.add(new EnviadorDeSms());
		lista.add(new Impressora());
		lista.add(new Multiplicador(5));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(lista);
		
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
