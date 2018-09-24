package banco;

public class Guardador_de_Objetos {
	
	private Object[] ArraydeContas = new Object[100];
	private int posicao = 0;
	


	public void addObject (Object a){
		this.ArraydeContas [posicao] = a;
		posicao++;
	}
	
	public Object pegaObject(int a) {
		
		return ArraydeContas[a];
	}
	

}
