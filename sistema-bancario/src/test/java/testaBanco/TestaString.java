package testaBanco;

import java.io.PrintStream;

public class TestaString {
	
	public static void main(String[] args) {
		
		System.out.println("Teste 00");
		
		String s = "fj11";
		String s0 = s.replace("1", "2");
		
		System.out.println(s0);
		System.out.println("Teste 00 \n");
		//*******************************
		//*******************************
		
		System.out.println("Teste 01");
		
		String s1 = "abCDEfg";
		boolean s2 = s1.contains("CDE");
		
		System.out.println(s2);
		
		System.out.println("Teste 01\n");
		//*******************************
		//*******************************
		
		System.out.println("Teste 02");
		String s3 = " Trim ";
		String s4 = s3.trim();
		
		System.out.println(s4);
		
		System.out.println("Teste 02\n");
		//*******************************
		//*******************************
		
		System.out.println("Teste 03");
		
		String s5 = new String();
		System.out.println(s5.isEmpty());
		s5 = "A";
		System.out.println(s5.isEmpty());
		
		System.out.println("Teste 03\n");
		//*******************************
		//*******************************
		
		System.out.println("Teste 04");
	
		String texto = "Seu texto";
		String texto2 = texto.replace(" ","");
		
		System.out.println(texto2);
		
		System.out.println("Teste 04\n");
		//*******************************
		//*******************************
		
		System.out.println("Teste 05");
		
		String lenght = "Hello World";
		System.out.println(lenght.length());
		
		System.out.println("Teste 05\n");
		//*******************************
		//*******************************
		System.out.println("Teste 06");

		PrintStream saida = System.out;
		saida.println("ola");
		
		System.out.println("Teste 06\n");

	}

}
