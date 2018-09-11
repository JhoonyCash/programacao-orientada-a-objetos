package testaBanco;
import banco.Conta;
import banco.ContaPoupanca;
import banco.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println("Você tentou depositar um valor inválido");
			}
		
		}
}
