package ejemplo_java;

public class Ejemplo_Metodo {
//Sobre carga cuando es un mismo metodo pero con diferente funcion
	public static void main(String[] args) {
		
		int resultadoSuma = suma(40,50);
		
		System.out.println(resultadoSuma);
		
		int resultadoSuma3 = suma(50,50,50);
		
		System.out.println(resultadoSuma3);

	}
	public static int suma(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		
		return d;
	}
}
