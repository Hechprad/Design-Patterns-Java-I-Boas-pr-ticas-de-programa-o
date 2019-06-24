package impostos;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
			System.out.println(impostoQualquer.calcula(orcamento));
	}
	
}
