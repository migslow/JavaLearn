package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej14 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el numero de filas");
		int filas = s.nextInt();
		System.out.println("Introduce el numero de columnas");
		int columnas = s.nextInt();
		int[][] numeros = new int[filas][columnas];
		escribirArray(numeros);
		leerArray(numeros);
		comprobarSimetrica(numeros);
	}

	public static void escribirArray(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print("Introduce Fila " + i + " Columna " + j + ": ");
				n[i][j] = s.nextInt();
			}
		}
	}

	public static void leerArray(int[][] n) {
		System.out.println("La matriz contiene los siguientes elementos:");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + "  ");
			}
			System.out.println("\t");
		}
	}

	public static void comprobarSimetrica(int[][] n) {
		boolean simetrica = true;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if (n[i][j] != n[j][i]) {
					simetrica = false;
				}
			}
			System.out.println("\t");
		}
		if (simetrica) {
			System.out.println("La matriz es simetrica");
		} else {
			System.out.println("La matriz no es simetrica");
		}
	}
}
