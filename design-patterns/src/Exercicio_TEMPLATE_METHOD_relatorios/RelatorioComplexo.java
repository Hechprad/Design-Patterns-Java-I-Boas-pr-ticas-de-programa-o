package Exercicio_TEMPLATE_METHOD_relatorios;

import java.util.Calendar;
import java.util.List;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("---RELAT�RIO COMPLEXO-----------------------------");
		System.out.println("Banco Java");
		System.out.println("Rua tr�s, n� 1000"); 
		System.out.println("Telefone: 999-555-111");
		System.out.println("--------------------------------------------------");
	}

	@Override
	protected void rodape() {
		System.out.println("--------------------------------------------------");
		System.out.println("banco_java@email.com.br");
		System.out.println("Data: " + Calendar.getInstance().getTime());;
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular() 
								+ " - " + "Ag�ncia: " + conta.getAgencia()
								+ " - " + "N�mero da conta: " + conta.getNumeroDaConta()
								+ " - " + "Saldo: " + conta.getSaldo());
		}
	}

}
