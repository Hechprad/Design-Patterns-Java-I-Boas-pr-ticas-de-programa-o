package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.ArrayList;
import java.util.List;

public class FiltraSaldoMaiorQue500Mil extends Filtro {

	public FiltraSaldoMaiorQue500Mil() {}
	
	public FiltraSaldoMaiorQue500Mil(Filtro outroFiltro) {
		super(outroFiltro);
	}
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<Conta>();
		
		for (Conta conta : contas) {
			if(conta.getSaldo() > 500000.0) {
				contasFiltradas.add(conta);
			}
		}
		
		return contasFiltradas;
	}
	
}
