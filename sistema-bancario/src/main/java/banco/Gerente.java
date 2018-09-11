package banco;

public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	private int numeroDeFuncionariosGerenciado;
	
	
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
	
	
	public boolean autentica(int senha) {
		if(this.senha != senha) {
			return true;
		}
			return false;
		
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciado() {
		return numeroDeFuncionariosGerenciado;
	}

	public void setNumeroDeFuncionariosGerenciado(int numeroDeFuncionariosGerenciado) {
		this.numeroDeFuncionariosGerenciado = numeroDeFuncionariosGerenciado;
	}
	
	
	
}
