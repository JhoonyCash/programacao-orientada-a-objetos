package banco;

public class Conta {
	
	private int numero;
	private int agencia;
	private Cliente dono;
	protected double saldo;
	private double limite;
	private static int totalDeContas; 
	
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
		Conta.totalDeContas++;
	}
	
	public Conta(int numero, int agencia, Cliente dono) {
		this.numero = numero;
		this.agencia = agencia;
		this.dono = dono;
		Conta.totalDeContas++;
	}
	
	public boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void atualiza(double taxa) {
		this.saldo += (this.saldo * taxa); 
	}
	
	public boolean transfereConta(Conta destino, double valor) {
		if(this.saca(valor) == false) {
			return false;
		}else {
			destino.deposita(valor);
			return true;
		}
	}
	
	public static int getTotalDeConta() {
		return Conta.totalDeContas;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
