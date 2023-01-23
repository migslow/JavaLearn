package ej04;

import java.util.Scanner;

/*
 * Claro, otro ejercicio en Java: Crea una clase llamada "Validador" con un método llamado "validaEdad" que tome un número como argumento y devuelva verdadero si el 
 * número está entre 18 y 90, en caso contrario devuelve falso. Utiliza un bloque try-catch para manejar la excepción de "NumberFormatException" si el argumento no es un número. 
 * Si el argumento no es un número, el método debe imprimir un mensaje de error y devolver falso.
 */

public class ej03 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(validaEdad(12));

	}

	public static boolean validaEdad(int n) {
		try {
			int num = n;
			if (num >= 18 && num <= 90) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			System.out.println("Error: El valor proporcionado no es un número");
			return false;
		}

	}

}
