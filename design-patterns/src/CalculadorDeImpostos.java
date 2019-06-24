
public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
			double resultado = impostoQualquer.calcula(orcamento);
			System.out.println(resultado);
	}
	
}
