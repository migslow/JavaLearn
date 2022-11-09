package ejerciciosWeb_paqueteArraysBidimensionales;

public class ej01 {

	public static void main(String[] args) {
		int[][] numeros = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		// Recorrer el array entero
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				System.out.println(numeros[i][j]);
			}
		}
		System.out.println("\nLa primera fila del array");
		// Recorrer la primera fila del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i][0]);
		}
		System.out.println("=================================================================");
		// Otra forma de mostrar por consola el array entero
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.println(numeros[i][j] + " ");
			}
		}
	}

}
