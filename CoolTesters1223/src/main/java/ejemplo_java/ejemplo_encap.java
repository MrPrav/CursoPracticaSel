package ejemplo_java;

public class ejemplo_encap {

	private int tipo;// cuando se pone privadso es porque quieres que la variable quede encapsulada y solo se puede acceder a ella por los metodos de abajo
	
	public void setTipo(int t) {
		tipo = t;
	}
	
	public int getTipo() {
		return tipo;
	}
}
