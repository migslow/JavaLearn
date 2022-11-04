package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

/*
 *  Programa Java que guarda en un array 10 números enteros que se leen por teclado. 
 *  A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
 */

public class ej04 {

	static Scanner s = new Scanner(System.in);
	static int m = 10;
	static int[] numeros = new int[m];

	public static void pedir() {
		System.out.println("Introduce 10 numeros por teclado: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el " + i + ": ");
			numeros[i] = s.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

	public static int positivo(int p) {
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
			if (numeros[i] < 0) {
				contador++;
			}
		}
		return contador;
	}

	public static int cero(int c) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 0) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		pedir();
		System.out.println("\nHay " + positivo(0) + " numeros positivos");
		System.out.println("Hay " + negativos(0) + " numeros negativos");
		System.out.println("Hay " + cero(0) + " numeros ceros");
	}

}
