package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.ArrayList;
import java.util.List;

public class TestaFiltroDeContas {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta("Jorge", 100);
		contas.add(c1);
		Conta c2 = new Conta("Leandro", 10100);
		contas.add(c2);
		Conta c3 = new Conta("Alan", 500100);
		contas.add(c3);
		Conta c4 = new Conta("Luiz", 70);
		contas.add(c4);
		
		Filtro filtraContas = new FiltroSaldoMenorQue100Reais(new FiltroSaldoMaiorQue500MilReais(new FiltroMesmoMes()));
		
		List<Conta> contasFiltradas = filtraContas.filtra(contas);
		
		for (Conta conta : contasFiltradas) {
			System.out.println("Titular: " + conta.getTitular());
		}
	}

}
