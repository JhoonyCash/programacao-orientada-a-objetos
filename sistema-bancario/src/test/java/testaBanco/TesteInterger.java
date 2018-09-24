package testaBanco;

public class TesteInterger {
	
	public static void main (String[] args) {
	
	Integer x1 = new Integer(10);
	Integer x2 = new Integer(10);
	
		if (x1 == x2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		int x = Integer.parseInt("123");
		int y = Integer.parseInt("abc");
		
		System.out.println(x +" | "+ y);
		
	}
}
