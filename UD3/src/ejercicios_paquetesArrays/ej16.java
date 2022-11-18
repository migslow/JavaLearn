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
		esMagica(numeros);
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
			System.out.println(" ");
		}
	}

	public static void esMagica(int[][] n) {
		int sumaC = 0;
		int sumaF = 0;
		for (int i = 0; i < n.length; i++) {
			sumaF = sumaF = n[i][0];
			for (int j = 0; i < n[0].length; i++) {
				sumaC = sumaC + n[0][j];

			}
		}
		System.out.println("La suma de las columnas: " + sumaC);
		System.out.println("La suma de las filas: " + sumaF);
		if (sumaC == sumaF) {
			System.out.println("Es magica");
		} else {
			System.out.println("No es magica");
		}

	}

}
