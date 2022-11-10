package ejerciciosRepaso_Arrays;

import java.util.Random;

public class ej06 {

	public static void main(String[] args) {
		int[] numeros = new int[20];
		int[] primos = new int[20];
		
		// comprobar si es primo
		int contador = 0;
		boolean esPrimo = false;
		for(int i = 2; i < numeros.length / 2;i++) {
			if(numeros % i == 0) {
				
			}
			if(contador == 2) {
				esPrimo = true;
			}
		}
		
		// generar 20 numeros aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}

		// mostrar el array inicial de 20 numeros aleatorios
		System.out.println("\nEl array es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		// mostrar los numeros que son primos
		
		// mostrar el array modificado solo con los numeros primos 
	}
}
