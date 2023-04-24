package ej03;

import java.util.Scanner;

public class ej09 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[5];
		visualizar(numeros);
		rotar(numeros);
	}

	public static void visualizar(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			numeros[i] = s.nextInt();
		}

		System.out.println("\nEl array con los numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
	}

	public static void rotar(int[] numeros) {
		int ultimo = numeros[14];
		for (int i = 13; i >= 0; i--) {
			numeros[i + 1] = numeros[i];
		}
		numeros[0] = ultimo;
		System.out.print("\nEl array se veria de esta manera: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
