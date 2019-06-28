package Exercicio_TEMPLATE_METHOD_relatorios;

import java.util.ArrayList;
import java.util.List;

public class TestaRelatorios {
	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(new Conta("José", "5554-5", "121212-1", 250.0));
		contas.add(new Conta("Roberta", "5554-6", "121212-2", 300.0));
		contas.add(new Conta("Miranda", "5554-7", "121212-3", 500.0));
		
		Relatorio  relatorioSimples = new RelatorioSimples();
		relatorioSimples.imprime(contas);
		
		Relatorio  relatorioComplexo = new RelatorioComplexo();
		relatorioComplexo.imprime(contas);
	}
}
