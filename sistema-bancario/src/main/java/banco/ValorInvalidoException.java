package banco;

public class ValorInvalidoException extends RuntimeException {
	
	public  ValorInvalidoException (double valor) {
		
		System.out.println("O valor "+valor+" é invalido");
		
	}
	

}
