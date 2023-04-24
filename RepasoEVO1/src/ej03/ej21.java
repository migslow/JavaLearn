package ej03;

import java.util.Scanner;

public class ej21 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[5];
		escrituraArray(numeros);
		esPar(numeros);
	}

	public static void escrituraArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			numeros[i] = s.nextInt();
		}

		System.out.println("\nEl array es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " ");
		}
	}

	public static void esPar(int[] numeros) {
		int contadorPar = 0, contadorImpar = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}

		System.out.println("Hay " + contadorPar + " numeros pares en este array");
		System.out.println("Hay " + contadorImpar + " numeros impares en este array");
	}

}
