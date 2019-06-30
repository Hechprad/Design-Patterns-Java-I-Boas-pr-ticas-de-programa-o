package Exercicio_DECORATOR_filtrosDeBanco;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	protected Filtro outroFiltro;

	public Filtro() {
	}

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	public abstract List<Conta> filtra(List<Conta> contas);

	protected List<Conta> proximoFiltro(List<Conta> contas) {
		if (outroFiltro != null) return outroFiltro.filtra(contas);
		return new ArrayList<Conta>();
	}
}
