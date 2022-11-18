package ejerciciosRepaso_Arrays;

import java.util.Random;

public class ej06 {

	public static void rellenarAleatorio(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

	public static boolean NumeroPrimo(int[] n, int[] p) {
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

			if (esPrimo) {
				p[i] = x;
			}
		}
		return esPrimo;
	}

	public static void rellenarArraySiSonPrimos(int[] n) {
		for (int i = 0; i < n.length; i++) {
			if(n[i] == NumeroPrimo(n, n)) {
				
			}
		}
	}

	public static void main(String[] args) {
		int[] numeros = new int[20];
		int[] primos = new int[20];
		boolean esPrimo = NumeroPrimo(numeros, primos);
		System.out.println("El array con los numeros aleatorios: ");
		rellenarAleatorio(numeros);
	}
}
