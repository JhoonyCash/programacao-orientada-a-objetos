package banco;

public class Cliente implements Autenticavel{
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	
	
	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
