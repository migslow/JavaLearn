package ejercicios;

import java.util.Scanner;

public class ejer09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la frase: ");
		String frase = s.nextLine();
		System.out.println("\nIntroduce la palabra a buscar: ");
		String palabra = s.nextLine();
		int contador = 0;

		String[] palabras = frase.split(" ");
		for (String p : palabras) {
			if (p.equals(palabra)) {
				contador++;
			}
		}
		System.out.println("\nLa palabra " + palabra + " aparece " + contador + " veces");

	}

}
