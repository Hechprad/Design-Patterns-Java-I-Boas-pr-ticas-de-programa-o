package impostos;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println("VALOR DOS IMPOSTOS: " + valor);

		Imposto testaImpostoMuitoAlto = new ImpostoMuitoAlto(new ISS());
		double valor2 = testaImpostoMuitoAlto.calcula(orcamento);
		System.out.println("VALOR DOS IMPOSTOS: " + valor2);
	}
}
