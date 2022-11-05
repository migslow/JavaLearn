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

	public static void media() {
		int positivo = 0, negativo = 0;
		double sumaPos = 0, sumaNeg = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				sumaPos = sumaPos + numeros[i];
				positivo++;
			} else if (numeros[i] < 0) {
				sumaNeg = sumaNeg + numeros[i];
				negativo++;
			}
		}
		if (positivo != 0) {
			System.out.println("\nMedia de los valores positivos: " + sumaPos / positivo);
		} else {
			System.out.println("No ha introducido numeros positivos");
		}
		if (negativo != 0) {
			System.out.println("Media de los valores negativos: " + sumaNeg / negativo);
		} else {
			System.out.println("No ha introducido numeros negativos");
		}

	}

	public static void main(String[] args) {
		pedir();
		media();
	}

}
