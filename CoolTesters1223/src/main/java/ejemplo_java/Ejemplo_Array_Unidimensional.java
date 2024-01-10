package ejemplo_java;

public class Ejemplo_Array_Unidimensional {

	public static void main(String[] args) {
		int intArray[];
		int [] intArray2;
		
		//Declarar Array de Strings
		String[] arr;
		
		
		//asignando memoria/posiciones al array
		arr = new String[5];
		
		//Inicializando y asignar el primer elemento del arreglo
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		System.out.println("El numero que quiero imprimir esta en la posicion 2 " + arr[2]);
		
		//acceder A TODOS LOS elementos del arreglo
		for(int i = 0; i < arr.length; i++ ) {
			System.out.println("Elemento en la posicion: " + i + " : " + arr[i]);
		}
	}

}
