package banco;

public class ContaCorrente extends Conta{
	
	@Override
	public void atualiza(double taxa) {
		super.saldo += (super.saldo * taxa * 2);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor - 0.1;
	}
}
