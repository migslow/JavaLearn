package ej03;

import java.util.Scanner;

public class ej36 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		mediaPositivos(numeros);
		mediaNegativos(numeros);
	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce un numero en la posicion [" + i + "]: ");
			v[i] = s.nextInt();
		}

		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " - ");
		}
	}

	public static void mediaPositivos(int[] v) {
		double media = 0;
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= 0) {
				suma = suma + v[i];
			}
		}
		media = suma / v.length;
		System.out.println("\nLa media de numeros positivos es: " + media);
	}

	public static void mediaNegativos(int[] v) {
		double media = 0;
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 0) {
				suma = suma + v[i];
			}
		}
		media = suma / v.length;
		System.out.println("\nLa media de numeros negativos es: " + media);
	}

}
