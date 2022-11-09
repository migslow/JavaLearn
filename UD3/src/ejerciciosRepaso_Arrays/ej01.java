package ejerciciosRepaso_Arrays;

import java.util.Scanner;

public class ej01 {

	static Scanner s = new Scanner(System.in);
	static int[] numeros = new int[10];

	public static void leer() {
		System.out.println("Introduce los 10 numeros por teclado: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Elemento " + i + ": ");
			numeros[i] = s.nextInt();
		}
		for (int c : numeros) {
			System.out.println(c);
		}
	}

	public static void posicion(int[] n, int max, int min) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == max) {
				System.out.println(numeros[i] + " se encuentra en la posicion" + (i + 1));
			}
			if (numeros[i] == min) {
				System.out.println(numeros[i] + " se encuentra en la posicion" + (i + 1));
			}
		}
	}

	public static int maximo(int[] max) {
		int maximo = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
		}
		return maximo;
	}

	public static int minimo(int[] min) {
		int minimo = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < minimo) {
				minimo = numeros[i];
			}
		}
		return minimo;
	}

	public static void main(String[] args) {
		leer();
		int min, max;
		max = maximo(numeros);
		min = minimo(numeros);
		System.out.println("El numero maximo es: " + maximo(numeros));
		posicion(numeros, max, max);
		System.out.println("EL numero minimo es: " + minimo(numeros));
		posicion(numeros, max, max);
	}

}
