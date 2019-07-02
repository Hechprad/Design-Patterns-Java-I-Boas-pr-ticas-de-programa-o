package impostos;

public class EnviadorDeSms implements AcaoAposGerarNota {
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por SMS");
	}
}
