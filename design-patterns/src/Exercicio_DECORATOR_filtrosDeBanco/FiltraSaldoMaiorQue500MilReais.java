package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.ArrayList;
import java.util.List;

public class FiltraSaldoMaiorQue500MilReais extends Filtro {

	public FiltraSaldoMaiorQue500MilReais() {}
	
	public FiltraSaldoMaiorQue500MilReais(Filtro outroFiltro) {
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
		
		contasFiltradas.addAll(proximoFiltro(contas));
		return contasFiltradas;
	}
	
}
