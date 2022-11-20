package metodos_alumnos;

import java.util.Scanner;

public class ej01 {

	static int maximo;
	static int total;
	static int pares;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[4];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce numeros enteros y que finalice con 0: ");
			n[i] = s.nextInt();

		}
		maximo = maximo(n);
		total = total(n);
		pares = pares(n);
		System.out.println("Total numeros: " + total);
		System.out.println("Total numeros Pares: " + pares);
		System.out.println("El numero maximo es: " + maximo);
	}

	public static int maximo(int[] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > maximo) {
				maximo = n[i];
			}
		}
		return maximo;
	}

	public static int total(int[] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 0 || n[i] <= 0) {
				contador++;
			}
		}
		return contador;
	}

	public static int pares(int[] n) {
		int contador = 0;
		for (int i = 1; i < n.length; i++) {
			if (n[i] % i == 0) {
				contador++;
			}
		}
		return contador;
	}
}
