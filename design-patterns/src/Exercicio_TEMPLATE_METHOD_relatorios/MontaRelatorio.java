package Exercicio_TEMPLATE_METHOD_relatorios;

import java.util.List;

public class MontaRelatorio {
	
	public void montaRelatorioSimples(List<Conta> contas) {
		Relatorio  rel1 = new RelatorioSimples();
		rel1.cabecalho();
		rel1.corpo(contas);
		rel1.rodape();
	}
	public void montaRelatorioComplexo(List<Conta> contas) {
		Relatorio  rel1 = new RelatorioComplexo();
		rel1.cabecalho();
		rel1.corpo(contas);
		rel1.rodape();
	}
}
