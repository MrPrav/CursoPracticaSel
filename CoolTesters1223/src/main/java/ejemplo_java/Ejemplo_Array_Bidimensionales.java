package ejemplo_java;

public class Ejemplo_Array_Bidimensionales {

	public static void main(String[] args) {
		int arr[][] = { {2,7,9} , {3,6,1} , {7,4,2} };
		
		System.out.println(arr[0][2]);

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
