package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej16 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el numero de filas: ");
		int filas = s.nextInt();
		System.out.println("Introduce el numero de columnas: ");
		int columnas = s.nextInt();
		int[][] numeros = new int[filas][columnas];
		escribirArray(numeros);
		leerArray(numeros);
	}

	public static void escribirArray(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
					
				/*
				 * System.out.print("Introduce Fila " + i + " Columna " + j + ": "); n[i][j] =
				 * s.nextInt();
				 */
			}
		}
	}

	public static void leerArray(int[][] n) {
		System.out.println("La matriz contiene los siguientes elementos:");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + "  ");
			}
			System.out.println(" ");
		}
	}

}
