package ej03;

import java.util.Arrays;
import java.util.Scanner;

public class ej39 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[20];
		rellenarNumerosAle(numeros);
		System.out.println("\nEl array solo con los numeros primos: ");
		numerosPrimos(numeros);
		
		// ordenarArray(numeros);
		System.out.println("\nEl array con los numeros ordenados: \n" + Arrays.toString(numeros));
	}

	public static void rellenarNumerosAle(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}

	public static void numerosPrimos(int[] v) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				System.out.print(v[i] + " - ");
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length - 1; j++) {
				int aux = v[j], auxSig = v[j + 1];
				if(aux > auxSig) {
					v[j] = auxSig;
					v[j + 1] = aux;
				}
			}
		}
	}
	/*
	public static void ordenarArray(int[] v) {
		
	}
	*/

}
