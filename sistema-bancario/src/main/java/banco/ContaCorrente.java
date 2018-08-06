package banco;

public class ContaCorrente extends Conta{
	
	
	public void atualiza(double taxa) {
		super.saldo += (super.saldo * taxa * 2);
	}
	
	
	
	public void deposita(double valor) {
		super.saldo += valor - 0.1;
	}
}
