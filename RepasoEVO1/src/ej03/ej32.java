package ej03;

import java.util.Scanner;

public class ej32 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[5];
		rellenarArray(numeros);
		System.out.println("\nEl numero mayor es: " + maximo(numeros));
		System.out.println("\nEl total de todos los numeros es: " + totalNumeros(numeros));
		System.out.println("\nLa suma de todos los numeros pares es: " + totalNumerosPares(numeros));

	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == 0) {
				System.out.println("Introduce el numero en la posicion [" + i + "]: ");
				v[i] = s.nextInt();
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
		System.out.println();
	}
	
	public static int maximo(int[] v) {
		int maximo = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] > maximo) {
				maximo = v[i];
			}
		}
		return maximo;
	}
	
	public static int totalNumeros(int[] v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i];
		}
		return suma;
	}
	
	public static int totalNumerosPares(int[]v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] % 2 == 0) {
				suma = suma + v[i];
			}
		}
		return suma;
	}
	
}
