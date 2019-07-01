package Exercicio_STATE_contaBancaria;

public class TestaEstadoDeUmaConta {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.deposita(100.0);
		System.out.println(c.estadoAtual);
		
		c.saca(200.0);
		System.out.println(c.estadoAtual);

	}

}
