package Exercicio_CHAIN_OF_RESPONSABILITY_requisicoesWeb;

public class TesteDeTiposDeRequisicoes {

	public static void main(String[] args) {
		VerificadorDeRequisicao requisicao = new VerificadorDeRequisicao();
		
		Conta c1 = new Conta("Jorge", 100.0);
		
		Requisicao req1 = new Requisicao(Formato.XML);
		Requisicao req2 = new Requisicao(Formato.CSV);
		Requisicao req3 = new Requisicao(Formato.PORCENTO);
		
		requisicao.verifica(req1, c1);
		requisicao.verifica(req2, c1);
		requisicao.verifica(req3, c1);

	}

}
