package ej03;

import java.util.Iterator;
import java.util.Scanner;

public class ej28 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		rellenarMatriz(numeros);
		sumaFilas(numeros);
		sumaColumnas(numeros);
		sumaElementos(numeros);
	}

	public static void rellenarMatriz(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.println("Introduce el numero en la fila [" + i + "] columnas [" + j + "]: ");
				v[i][j] = s.nextInt();
			}
		}

		System.out.println("\nLa matriz es: ");
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print(v[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public static void sumaFilas(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			int suma = 0;
			for (int j = 0; j < v.length; j++) {
				suma = suma + v[i][j];
			}
			System.out.print("\nLa suma de la fila [" + i + "] es: " + suma);
		}
		System.out.println("");
	}

	public static void sumaColumnas(int[][] v) {
		for (int j = 0; j < v.length; j++) {
			int suma = 0;
			for (int i = 0; i < v.length; i++) {
				suma = suma + v[i][j];
			}
			System.out.print("\nLa suma de la columna [" + j + "] es: " + suma);
		}
		System.out.println("");
	}

	public static void sumaElementos(int[][] v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				suma = suma + v[i][j];
			}
		}
		System.out.println("\nLa suma de los elementos de la matriz es: " + suma);
	}

}
