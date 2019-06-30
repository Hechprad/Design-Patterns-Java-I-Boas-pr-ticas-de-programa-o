package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes() {}
	
	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<Conta>();

        for(Conta conta : contas) {
          if(conta.getDataDeAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) && 
            conta.getDataDeAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
              contasFiltradas.add(conta);
          }
        }
        
		contasFiltradas.addAll(proximoFiltro(contas));
		return contasFiltradas;
	}

}
