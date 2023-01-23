package ej04;

import java.util.Scanner;

/*
 * Ejercicio: Crea un programa en Java que solicite al usuario ingresar el índice de un arreglo, y luego imprima el valor en esa posición. 
 * Utiliza try-catch para manejar la excepción en caso de que el usuario ingrese un índice fuera de los límites del arreglo. 
 * En ese caso, imprime un mensaje indicando que "El índice ingresado es inválido".
 */

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] lista = { 1, 2, 3, 4 };

		System.out.println("Introduce un indice del arreglo: ");
		int n = s.nextInt();
		try {
			int valor = lista[n];
			System.out.println("Valor en el indice " + n + " es: " + valor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Esa posicion del indice no se encuentra en el array.");
		}
	}

}
