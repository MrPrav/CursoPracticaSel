package ejemplo_java;

public class ejemplo_Encap_Demo {

	public static void main(String[] args) {
		ejemplo_encap encap = new ejemplo_encap();
		
		//encap.tipo = 10; asi es una variable que es publica y no eszta encapsulada
	
		encap.setTipo(5);
		
		System.out.println("El tipo es: " + encap.getTipo());

	}

}
