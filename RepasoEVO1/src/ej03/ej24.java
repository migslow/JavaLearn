package ej03;

import java.util.Scanner;

public class ej24 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el tamaño del array: ");
		int n = s.nextInt();
		int[][] matriz = new int[n][n];
		rellenarArray(matriz);

	}

	public static void rellenarArray(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.println("Introduce el numero en el vector: [" + i + "]: ");
				v[i][j] = s.nextInt();
			}
		}

		System.out.println("\nEl array es: ");
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print(v[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int sumaFila(int[][] v, int fila) {
		int suma;
		for (int i = 0; i < v.length; i++) {
			
		}
	}

}
