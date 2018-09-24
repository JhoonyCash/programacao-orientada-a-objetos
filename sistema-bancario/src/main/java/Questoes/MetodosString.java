package Questoes;

public class MetodosString {
	
	public static void inverteString(String texto) {
        
		System.out.print("\t");
       
		StringBuilder invertido = new StringBuilder(texto).reverse();
        System.out.println(invertido);
    }
	
	public static void invertePalavras(String txt) {
		
		String Array[] = txt.split(" ");
		
		for(int i = Array.length-1; i >= 0; i--) {
		
			System.out.print(Array[i]+" ");
		}
		
		System.out.println();
	}
	
	public static void inverteBuilder(String txt) {
		
		String s = new StringBuilder(txt).reverse().toString();
		System.out.println(s);
		
		}
	
		
	}
		
	


