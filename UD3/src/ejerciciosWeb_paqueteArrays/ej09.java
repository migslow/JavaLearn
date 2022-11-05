package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

/*
 * Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra por letra y la suma de sus caracteres.
 */

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = s.next();
		char[] caracteres = new char[palabra.length()];
		int contador = 0;
		for(int i = 0; i < palabra.length(); i++) {
			contador++;
			caracteres[i] = palabra.charAt(i);
			System.out.println(caracteres[i]);
		}
		System.out.println("La cantidad de letras son: " + contador);

	}

}
