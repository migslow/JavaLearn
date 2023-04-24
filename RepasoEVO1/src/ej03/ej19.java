package ej03;

import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

public class ej19 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[5];
		escrituraArray(numeros);
		System.out.println("\nLa suma de todos los numeros es: " + sumaDeNumerosEnElArray(numeros));
		System.out.println("El numero maximo es: " + maximo(numeros));
		System.out.println("El numero minimo es: " + minimo(numeros));
		System.out.println("La nota media es: " + media(numeros));
	}

	public static void escrituraArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingresa un numero en la posicion: [" + i + "]");
			numeros[i] = s.nextInt();
		}

		System.out.println("\nEl array es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
	}

	public static int sumaDeNumerosEnElArray(int[] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return suma;
	}

	public static int maximo(int[] numeros) {
		int max = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		return max;
	}

	public static int minimo(int[] numeros) {
		int min = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		return min;
	}

	public static double media(int[] numeros) {
		double media = 0, suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return media = suma / numeros.length;
	}

}
