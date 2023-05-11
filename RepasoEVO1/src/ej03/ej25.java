package ej03;

import java.util.Scanner;

public class ej25 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarMatriz(numeros);
		arrayInverso(numeros);
	}

	public static void rellenarMatriz(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion[" + i + "]: ");
			v[i] = s.nextInt();
		}

		System.out.println("\nEl array original: ");
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		System.out.println();
	}
	
	public static void arrayInverso(int[]v) {
		System.out.println("\nEl array inverso es: ");
		for (int i = 9; i >=0; i--) {
			System.out.println(v[i]);
		}
		System.out.println();
	}

}
