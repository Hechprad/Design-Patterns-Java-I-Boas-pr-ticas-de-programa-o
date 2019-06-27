package Exercicio_CHAIN_OF_RESPONSABILITY_requisicoesWeb;

public class VerificadorDeRequisicao {
	
	public void verifica(Requisicao req, Conta conta) {
		Resposta res1 = new RespostaEmXml();
		Resposta res2 = new RespostaEmCsv();
		Resposta res3 = new RespostaEmPorcento();
		
		res1.setProxima(res2);
		res2.setProxima(res3);
		
		res1.responde(req, conta);
	}
}
