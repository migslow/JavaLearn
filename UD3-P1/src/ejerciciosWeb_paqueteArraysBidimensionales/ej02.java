package ejerciciosWeb_paqueteArraysBidimensionales;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int filas, columnas;
		System.out.println("Introduce el numero de filas: ");
		filas = s.nextInt();
		System.out.println("Introduce el numero de columnas: ");
		columnas = s.nextInt();
		int[][] numeros = new int[filas][columnas];

		System.out.println("Introduce los valores en el array: ");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int num = s.nextInt();
				numeros[i][j] = num;
			}
		}
		System.out.println("Imprime el array: ");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println(numeros[i][j]);
			}
		}
	}
}
