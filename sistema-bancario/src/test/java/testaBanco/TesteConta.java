package testaBanco;

import banco.Conta;
import banco.ContaCorrente;

public class TesteConta {
	
	public static void main (String [] args) {
		
		Conta conta = new ContaCorrente();
		Conta conta2 = new ContaCorrente();
				
		System.out.println(conta);
		
		System.out.println(conta.equals(conta2));
		
		
	}

}
