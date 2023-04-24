package ej03;

import java.util.Arrays;
import java.util.Scanner;

public class ej20 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[5];
		escrituraArray(numeros);
		ordenarArrayAscendente(numeros);
		System.out.println("\nEl array ordenado de forma descendente es: ");
		ordenarArrayDescendente(numeros);
	}

	public static void escrituraArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			numeros[i] = s.nextInt();
		}

		System.out.println("\nEl array es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
	}

	public static void ordenarArrayAscendente(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			Arrays.sort(numeros);	
		}
		System.out.println("\nEl array ordenado de forma ascendente: " + Arrays.toString(numeros));
	}
	
	public static void ordenarArrayDescendente(int[] numeros) {
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " - ");
		}
	}

}
