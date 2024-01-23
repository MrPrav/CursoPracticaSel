package ejemplo_Herencia;

public class Lados3 {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();

		t1.base = 4.0;
		t1.altura = 8.0;
		t1.estilo = "Estilo 1";
		
		System.out.println("Informacion para T1: ");
		t1.mostrarEstilo();
		t1.mostrarDimensiones();
		System.out.println("Su area es: " + t1.area());
		
		System.out.println();// Polimorfismo es cuando hacemos diferentes objetos y todos respinden diferente a un llamado
		
		Triangulo t2 = new Triangulo();
		
		t2.base = 6.0;
		t2.altura = 7.3;
		t2.estilo = "Estilo 2";
		
		System.out.println("Informacion para T2: ");
		t2.mostrarEstilo();
		t2.mostrarDimensiones();
		System.out.println("Su area es: " + t2.area());
	}

}
