
public class CalculadorDeImpostos {

	public void realizaCalculoICMS(Orcamento orcamento, Imposto impostoQualquer) {
			double icms = new ICMS().calculaICMS(orcamento);
			System.out.println(icms);
	}
//teste
	public void realizaCalculoISS(Orcamento orcamento) {
		double iss = new ISS().calculaISS(orcamento);
		System.out.println(iss);
	}
	
}
