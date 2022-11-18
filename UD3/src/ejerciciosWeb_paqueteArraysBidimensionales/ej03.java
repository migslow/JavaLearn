package ejerciciosWeb_paqueteArraysBidimensionales;

/*
 *  Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
 */

public class ej03 {

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = numerosAleatorios();
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static int numerosAleatorios() {
		int suma = 0, contador = 0;
		for (int i = 0; i < 9; i++) {
			suma = i + 1;
			contador++;
		}
		return contador;
	}

}
