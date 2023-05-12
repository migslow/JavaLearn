package ej03;

import java.util.HashSet;
import java.util.Scanner;

public class ej24 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		rellenarArray(numeros);
		System.out.println("\nLa media es " + media(numeros));
		maximo(numeros);
		minimo(numeros);
		numerosPrimos(numeros);
	}

	public static void rellenarArray(int[][] v) {
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

	public static double media(int[][] v) {
		double media = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				media = media + v[i][j];
			}
		}
		return media / v.length;
	}

	public static void maximo(int[][] v) {
		int maximo = 0, contador = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (v[i][j] > maximo) {
					maximo = v[i][j];
				}
				if (v[i][j] == maximo) {
					contador++;
				}
			}
		}
		System.out.println("\nEl numero maximo es: " + maximo + " y se repite: " + contador + " veces");
	}

	public static void minimo(int[][] v) {
		int minimo = 0, contador = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (v[i][j] < minimo) {
					minimo = v[i][j];
				}
				if (v[i][j] == minimo) {
					contador++;
				}
			}
		}
		System.out.println("\nEl numero minimo es: " + minimo + " y se repite: " + contador + " veces");
	}

	public static void numerosPrimos(int[][] v) {
		HashSet<Integer> primos = new HashSet<Integer>();
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (esPrimo(v[i][j])) {
					primos.add(v[i][j]);
				}
			}
		}
		for (int primo : primos) {
			System.out.print(primo + " - ");
		}

	}

	public static boolean esPrimo(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
