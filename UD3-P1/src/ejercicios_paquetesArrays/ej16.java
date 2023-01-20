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
		int fila = 0, columna = 0;

		escribirArray(numeros);
		System.out.println();
		leerArray(numeros);
		System.out.println();
		//
		int sumaC = calculoColumnas(numeros, fila);
		int sumaF = calculoFilas(numeros, columna);
		if (sumaC == sumaF) {
			System.out.println("Es magica");
		} else {
			System.out.println("No es magica");
		}
	}

	// Array con suma de filas
	public static int calculoFilas(int[][] n, int fila) {
		int suma = 0;
		for (int j = 0; j < n.length; j++) {
            suma = suma + n[fila][j];
        }
        return suma;
	}

	// Array con suma de columnas
	public static int calculoColumnas(int[][] n, int columna) {
		 int suma = 0;
	        for (int i = 0; i < n.length; i++) {
	            suma = suma + n[i][columna];
	        }
	        return suma;
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
}
