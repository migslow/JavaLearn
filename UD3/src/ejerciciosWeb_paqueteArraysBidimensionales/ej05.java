package ejerciciosWeb_paqueteArraysBidimensionales;

import java.util.Scanner;

/*
 *  Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. 
 *  Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices originales y el resultado.
 */

public class ej05 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Introduce las filas: ");
		int filas = s.nextInt();
		System.out.print("Introduce las columnas: ");
		int columnas = s.nextInt();

		int[][] matriz1 = new int[filas][columnas];
		int[][] matriz2 = new int[filas][columnas];
		int[][] resultado = new int[filas][columnas];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {

				System.out.println("Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 1");
				matriz1[i][j] = s.nextInt();
				System.out.println("Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 2");
				matriz2[i][j] = s.nextInt();

				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		visualizarMatrices(resultado);
	}

	public static void visualizarMatrices(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
