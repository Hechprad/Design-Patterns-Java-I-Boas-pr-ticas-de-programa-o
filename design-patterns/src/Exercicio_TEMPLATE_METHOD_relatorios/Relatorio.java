package Exercicio_TEMPLATE_METHOD_relatorios;

import java.util.List;

abstract class Relatorio {
    protected abstract void cabecalho();
    protected abstract void corpo(List<Conta> contas);
    protected abstract void rodape();

    public void imprime(List<Conta> contas) {
      cabecalho();
      corpo(contas);
      rodape();
    }
  }