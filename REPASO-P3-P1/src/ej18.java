import java.util.Scanner;

public class ej18 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		rellenarArray(numeros);
		System.out.println("La suma es: " + sumaTodoElVector(numeros));
	}

	public static void rellenarArray(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print("Introduce el numero en la posicion: [" + i + "]" + "[" + j + "]: ");
				v[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print(v[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int sumaTodoElVector(int[][]v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				suma = suma + v[i][j];
			}
		}
		return suma;
	}

}
