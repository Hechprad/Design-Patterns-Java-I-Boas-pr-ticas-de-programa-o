package Exercicio_CHAIN_OF_RESPONSABILITY_requisicoesWeb;

public interface Resposta {
	public void responde(Requisicao req, Conta conta);
	public void setProxima(Resposta resposta);
}
