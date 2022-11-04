package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

/*
 * Programa Java que llene un array con 10 números enteros que se leen por teclado. 
 * A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.
 */

public class ej06 {

	static Scanner s = new Scanner(System.in);
	static int n = 10;
	static int[] numeros = new int[n];

	public static void pedir() {
		System.out.println("Introduce 10 numeros por teclado: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("El elemento " + i + ": ");
			numeros[i] = s.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

	public static int positivos(int p) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				contador++;
			}
		}
		return contador;
	}

	public static int negativos(int n) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= 0) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		pedir();
		System.out.println("\nLa media de los numeros positivos es: " + positivos(0));
		System.out.println("\nLa media de los numeros negativos es: " + negativos(0));
	}

}
