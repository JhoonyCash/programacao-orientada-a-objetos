package TesteQuestoes;

public class Ultima {

	public static void main (String[] args) {
		
		String s = "123456789";
		
		int aux = 0;
		int num = 0;
		
		double saida = Math.pow(10, s.length() -1);
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			aux = c - '0';
			aux *= saida;
			num += aux;
			
			saida /= 10;
		}
		System.out.println(num);
	
		
	}
}
