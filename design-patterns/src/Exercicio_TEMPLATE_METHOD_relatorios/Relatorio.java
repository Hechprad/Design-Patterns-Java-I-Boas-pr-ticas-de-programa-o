package Exercicio_TEMPLATE_METHOD_relatorios;

import java.util.List;

abstract class Relatorio {
    protected abstract void cabecalho();
    protected abstract void rodape();
    protected abstract void corpo(List<Conta> contas);

    public void imprime(List<Conta> contas) {
      cabecalho();
      corpo(contas);
      rodape();
    }
  }