package ej03;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero en el vector: [" + i + "]");
			numeros[i] = s.nextInt();
		}

		System.out.println("\nEl array es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
		System.out.println(" ");

		System.out.println("\nEl array a la inversa es: ");
		for (int i = 9; i >= 0; i--) {
			System.out.print(numeros[i] + " - ");
		}
		System.out.println(" ");

	}

}
