package Exercicio_TEMPLATE_METHOD_relatorios;

import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco do Brasil");
	}

	@Override
	protected void rodape() {
		System.out.println("Telefone: 999-555-111");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular() + " - " + "Saldo: " + conta.getSaldo());
		}
	}

}
