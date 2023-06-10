import java.util.Scanner;

public class ej18 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		rellenarArray(numeros);
		System.out.println("La suma de todo el vector es: " + sumaTodoElVector(numeros));
		sumaFilas(numeros);
		sumaColumnas(numeros);
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

	public static int sumaTodoElVector(int[][] v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				suma = suma + v[i][j];
			}
		}
		return suma;
	}

	public static void sumaFilas(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			int suma = 0;
			for (int j = 0; j < v.length; j++) {
				suma = suma + v[i][j];
			}
			System.out.println("La suma de la fila: " + i + " es " + suma);
		}
	}
	
	public static void sumaColumnas(int[][] v) {
		for (int j = 0; j < v.length; j++) {
			int suma = 0;
			for (int i = 0; i < v.length; i++) {
				suma = suma + v[i][j];
			}
			System.out.println("La suma de la columna: " + j + " es " + suma);
		}
	}
	
}
