package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.ArrayList;
import java.util.List;

public class FiltraSaldoMenorQue100 extends Filtro {
	
	public FiltraSaldoMenorQue100() {}
	
	public FiltraSaldoMenorQue100(Filtro outroFiltro) {
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
		
		return contasFiltradas;
	}

}
