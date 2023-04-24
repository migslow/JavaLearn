package ej03;

import java.util.Scanner;

public class ej23 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[5];
		escribirArray(numeros);
	}

	public static void escribirArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			numeros[i] = s.nextInt();
		}

		System.out.println("\nEl array es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	public static int numeroSeRepite(int[] numeros) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == numeros[i]) {
				contador++;
			}
		}
		return contador;
	}

}
