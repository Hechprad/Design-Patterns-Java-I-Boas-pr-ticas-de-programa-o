package impostos;

public class NotaFiscalDao implements AcaoAposGerarNota {
	public void salvaNoBanco(NotaFiscal nf) {
		System.out.println("Salvei no banco");
	}
}
