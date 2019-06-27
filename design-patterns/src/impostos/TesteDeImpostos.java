package impostos;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		Imposto ihit = new IHIT();
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("BORRACHA", 200.0));
		orcamento.adicionaItem(new Item("CANETA", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 100.0));
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
		calculador.realizaCalculo(orcamento, icpp);
		calculador.realizaCalculo(orcamento, ikcv);
		calculador.realizaCalculo(orcamento, ihit);
	}

}
