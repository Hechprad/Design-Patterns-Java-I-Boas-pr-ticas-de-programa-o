package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMenorQue100Reais extends Filtro {
	
	public FiltroSaldoMenorQue100Reais() {}
	
	public FiltroSaldoMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<Conta>();
		
		for (Conta conta : contas) {
			if(conta.getSaldo() < 100.0) {
				contasFiltradas.add(conta);
			}
		}
		
		contasFiltradas.addAll(proximoFiltro(contas));
		return contasFiltradas;
	}

}
