package banco;

public class ContaPoupanca extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		super.saldo += (super.saldo * taxa * 3);
	}
	

}
