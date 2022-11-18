package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

/*
 * 1. Calcular la media de una serie de números que se leen por teclado.
 * 2. Leer 10 números enteros por teclado y guardarlos en un array. 
 * Calcula y muestra la media de los números que estén en las posiciones pares del array.
 */

public class ej12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] numeros = new int[10];
		double suma = 0, media = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce los numeros enteros en la posicion " + (i + 1) + ": ");
			numeros[i] = s.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
		
		// Media de todos los numeros
		for(int i = 0; i < numeros.length;i++) {
			suma = suma + numeros[i];
		}
		media = suma / numeros.length;
		
		System.out.println("\nLa media de los numeros es: " + media);

		
		// Media de los numeros pares
		for(int i = 0; i < numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				suma = suma + numeros[i];
			}
			media = suma / numeros.length;
		}
		System.out.println("\nLa media de los numeros pares es: " + media/5);
		
		
		
	}

}
