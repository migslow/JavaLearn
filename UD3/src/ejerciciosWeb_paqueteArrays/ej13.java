package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

/*
 * Leer por teclado la nota de los alumnos de una clase y calcular la nota media del grupo. Mostar los alumnos con notas superiores a la media.
 */

public class ej13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero de notas de una clase: ");
		int n = s.nextInt();
		double suma = 0, media = 0;
		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce las notas en la posicion " + (i + 1) + ": ");
			numeros[i] = s.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}

		// Media de todas las notas
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		media = suma / numeros.length;
		System.out.println("\nLa media de todas las notas es: " + media);

		// Media superior
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > media) {
				System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + numeros[i]);
			}
		}
	}
}
