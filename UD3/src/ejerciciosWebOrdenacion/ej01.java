package ejerciciosWebOrdenacion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ej01 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la dimension del array: ");
		int n = s.nextInt();
		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
			System.out.print(numeros[i] + " - ");
		}

		System.out.println();
		ascendente(numeros);
		System.out.println();
		descendente(numeros);
	}

	public static void ascendente(int[] n) {
		System.out.println("\nNumeros de forma ascendente");
		for (int i = 0; i < n.length; i++) {
			Arrays.sort(n);
			System.out.print(n[i] + " - ");
		}
	}

	public static void descendente(int[] n) {
		System.out.println("\nNumeros de forma descendente");
		for (int i = n.length - 1; i >= 0; i--) {
			Arrays.sort(n);
			System.out.print(n[i] + " - ");
		}
	}
}
