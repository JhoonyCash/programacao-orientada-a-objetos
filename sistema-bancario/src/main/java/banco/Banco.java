package banco;

public class Banco {
	
	private Conta[] contas;
	private int totalDeContas = 0;
	
	public Banco(int tamanhoDoVetor) {
		this.contas = new Conta[tamanhoDoVetor];
	}
	
	
	public void adiciona(Conta c) {
		this.contas[totalDeContas] = c;
		this.totalDeContas++;
	}
	
	public Conta getConta(int x) {
		for(int i = 0; i <= x; i++) {
			if(contas[i].equals(contas[x])) {
				return contas[x];
			}
		}
		

	throw new IllegalArgumentException("Conta não encontrada");
	}
	
	
	public int getTotalDeContas() {
		return this.totalDeContas;
	}
	
	
	public void setContas(Conta[] cs) {
		this.contas = cs;
	}
	
	
	
}
