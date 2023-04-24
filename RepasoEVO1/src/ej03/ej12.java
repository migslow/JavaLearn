package ej03;

import java.util.Scanner;

public class ej12 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[8];
		escribirDatos(numeros);
		System.out.println("\nEl numero convertido es: " + calcularBinario(numeros));
	}

	public static void escribirDatos(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el bit en la posicion: [" + i + "]");
			numeros[i] = s.nextInt();
		}
	}

	public static int calcularBinario(int[] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			if ((numeros[i] == 1 || numeros[i] == 0)) {
				if (numeros[0] == 1) {
					suma = suma + 128;
				}
				if (numeros[1] == 1) {
					suma = suma + 64;
				}
				if (numeros[2] == 1) {
					suma = suma + 32;
				}
				if (numeros[3] == 1) {
					suma = suma + 16;
				}
				if (numeros[4] == 1) {
					suma = suma + 8;
				}
				if (numeros[5] == 1) {
					suma = suma + 4;
				}
				if (numeros[6] == 1) {
					suma = suma + 2;
				}
				if (numeros[7] == 1) {
					suma = suma + 1;
				}
			}
		}
		return suma;
	}

}
