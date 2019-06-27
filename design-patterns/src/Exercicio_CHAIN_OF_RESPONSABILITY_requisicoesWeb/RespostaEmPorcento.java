package Exercicio_CHAIN_OF_RESPONSABILITY_requisicoesWeb;

public class RespostaEmPorcento  implements Resposta {

	private Resposta outraResposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else if(outraResposta != null) {
			outraResposta.responde(req, conta);
		} else {
            // n�o existe pr�xima na corrente, e ningu�m atendeu a requisi��o!
            // poder�amos n�o ter feito nada aqui, caso n�o fosse necess�rio!
            throw new RuntimeException("Formato de resposta n�o encontrado");
        }
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = null;
	}
}
