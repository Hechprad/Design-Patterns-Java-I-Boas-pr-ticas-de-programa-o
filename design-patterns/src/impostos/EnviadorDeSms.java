package impostos;

public class EnviadorDeSms implements AcaoAposGerarNota {
	public void enviaPorSms(NotaFiscal nf) {
		System.out.println("Enviei por SMS");
	}
}
