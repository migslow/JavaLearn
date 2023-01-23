package ej04;

import java.util.Scanner;

public class ej02 {

	/*
	 * Ejercicio: Crea un programa en Java que solicite al usuario ingresar un
	 * número y luego calcule su raíz cuadrada. Utiliza try-catch para manejar la
	 * excepción en caso de que el usuario ingrese un número negativo. En ese caso,
	 * imprime un mensaje indicando que
	 * "No se puede calcular la raíz cuadrada de un número negativo".
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();

		try {
			double resultado = Math.sqrt(n);
			System.out.println("El resutado de la raiz cuadrada es: " + resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Has introducido un numero negativo");
		}

	}

}
