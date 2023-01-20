package ejerciciosRepaso_Arrays;

import java.util.Scanner;

public class ej06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] numero = new int[20];
		int[] primo = new int[20];
		int contador;
		boolean esPrimo;
		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random() * 100);
		}
		contador = 0;
		for (int n : numero) {
			esPrimo = true;
			for (int i = 2; i <= Math.sqrt(n) && esPrimo; i++) {
				if ((n % i) == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				primo[contador] = n;
				contador++;
			}
		}
		System.out.println("Números generados:");
		for (int n : numero) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("\nNúmeros primos:");
		for (int n : primo) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("\nNúmeros primos:");
		for (int i = 0; i < contador; i++) {
			System.out.print(primo[i] + " ");
		}
	}
}
