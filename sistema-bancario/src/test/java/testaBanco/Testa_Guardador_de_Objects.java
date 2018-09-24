package testaBanco;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;
import banco.Funcionario;
import banco.Gerente;
import banco.Guardador_de_Objetos;


public class Testa_Guardador_de_Objects {
	
	public static void main(String[] args) {
		
//		Guardador_de_Objetos obj = new Guardador_de_Objetos();
//		Conta c1 = new Conta();
//		Gerente c2 = new Gerente();S
		
//		System.out.println(c1==c2);
//		
//		obj.addObject(c1);
//		obj.pegaObject(0);
//		
//		c1.setAgencia(1234);
//		c1.setNumero(123456);
//		
//		c2.setAgencia(1234);
//		c2.setNumero(123456);
//		
//		System.out.println(c1.equals(c2));
		
		Guardador_de_Objetos guardador = new Guardador_de_Objetos();
		ContaCorrente cc = new ContaCorrente();

		guardador.addObject(cc);
		
		int a = 0;
		ContaPoupanca cp = (ContaPoupanca) guardador.pegaObject(a);
		
		
		
	}

}
