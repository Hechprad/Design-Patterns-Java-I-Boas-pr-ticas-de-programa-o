package impostos;

public class Impressora implements AcaoAposGerarNota {
	public void executa(NotaFiscal nf) {
		System.out.println("Imprimi a nota fiscal");
	}
}
