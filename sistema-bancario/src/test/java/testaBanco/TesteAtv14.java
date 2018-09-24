package testaBanco;

import banco.Conta;
import banco.ContaCorrente;

public class TesteAtv14 {
	
	public static void main (String [] args) {
		
		Conta conta = new ContaCorrente();
		Conta conta2 = new ContaCorrente();
				
		conta.setNumero(123);
		conta2.setNumero(123);
		
		conta.setNome("Jonas");
		conta2.setNome("Jonas");
		
		conta.setAgencia(123);
		conta2.setAgencia(123);

		//System.out.println(conta);
		
		System.out.println(conta.equals(conta2));

	}

}
