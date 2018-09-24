package banco;

import java.nio.file.attribute.AclEntry.Builder;

public class Conta {

	private int numero;
	private String nome;
	private int agencia;
	private Cliente dono;
	protected double saldo;
	private double limite;
	private static int totalDeContas;

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		

		if(obj instanceof Conta) {
		
			Conta c = (Conta) obj;
			if (this.agencia == c.agencia && this.numero == c.numero && this.nome == c.nome) {
				return true;

			} else {
				return false;
			}
		}else {
			
			return false;
		}
		
	}


	@Override
	public String toString() {

		StringBuilder var = new StringBuilder();
		var.append("Numero da conta:" + numero + "\n");
		var.append("Numero da Agencia:" + agencia + "\n");
		var.append("Dono: " + dono + "\n");
		var.append("Saldo da Conta :" + saldo + "\n");
		var.append("Limite da Conta :" + limite + "\n");
		var.append("Total de Contas :" + totalDeContas + "\n");

		return var.toString();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getDono() {
		return dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public static void setTotalDeContas(int totalDeContas) {
		Conta.totalDeContas = totalDeContas;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

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
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public void deposita(double valor) {

		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}

	}

	public void atualiza(double taxa) {
		this.saldo += (this.saldo * taxa);
	}

	public boolean transfereConta(Conta destino, double valor) {
		if (this.saca(valor) == false) {
			return false;
		} else {
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
