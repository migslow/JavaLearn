package ej03;

import java.util.Scanner;

public class ej08 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		visualizar(numeros);
		int min, max;
		min = minimo(numeros);
		max = maximo(numeros);
		visualizarArrayFinal(numeros, max, min);
	}

	public static void visualizar(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el numero en el vector: [" + i + "] ==> ");
			numeros[i] = s.nextInt();
		}
		System.out.println(" ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
	}

	public static void visualizarArrayFinal(int[] numeros, int max, int min) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
			if (numeros[i] == min) {
				System.out.print("minimo ");
			}
			if (numeros[i] == max) {
				System.out.print("maximo ");
			}
			System.out.println();
		}
	}

	public static int maximo(int[] numeros) {
		int max = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		return max;
	}

	public static int minimo(int[] numeros) {
		int min = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		return min;
	}

}
