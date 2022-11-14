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

	 public static boolean NumeroPrimo(int[] n) {
			boolean esPrimo = true;
			for (int i = 2; i <= n.length / 2; i++)
				if ((n % i) == 0) {
					esPrimo = false;
					break;
				}
			return esPrimo;
		}

	public static void recorrerArrayPrimos(int[]n) {
		System.out.println("\nEl array solo con los numeros primos: ");
		for (int i = 0; i < n.length; i++) {
			if (n[i] == NumeroPrimo(n)) {

			}
		}
	}

	public static void main(String[] args) {
		int[] numeros = new int[20];
		// int[] primos = new int[20];
		boolean esPrimo = NumeroPrimo(numeros);
		System.out.println("El array con los numeros aleatorios: ");
		numerosAle(numeros);
	}
}
