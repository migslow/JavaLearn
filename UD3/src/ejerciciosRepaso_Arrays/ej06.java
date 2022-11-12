package ejerciciosRepaso_Arrays;

import java.util.Random;

public class ej06 {

	public static void numerosAle(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
		System.out.println("\nEl array es: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

	public static int esPrimo(int[] n) {
		int contador = 0;
		boolean esPrimo = false;
		for (int i = 0; i < n.length; i++) {
			int x = n[i];
			for (int j = 2; j < x / 2; j++) {
				if (x % j == 0) {
					esPrimo = false;
					break;
				} else
					esPrimo = true;
			}
		}
		return esPrimo;
	}

	public static void recorrerArrayPrimos(int[]n) {
		System.out.println("\nEl array solo con los numeros primos: ");
		for (int i = 0; i < n.length; i++) {
			if (n[i] == esPrimo) {

			}
		}
	}

	public static void main(String[] args) {
		int[] numeros = new int[20];
		// int[] primos = new int[20];
		boolean esPrimo = esPrimo(numeros);
		System.out.println("El array con los numeros aleatorios: ");
		numerosAle(numeros);
	}
}
