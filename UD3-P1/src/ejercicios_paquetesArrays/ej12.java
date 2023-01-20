package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la cadena de caracteres: ");
		String c = s.nextLine();
		// int[] contador = new int[5];
		int[] contador = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == 'a' || c.charAt(i) == 'A') {
				contador[0] = contador[0] + 1;
			}
			if (c.charAt(i) == 'e' || c.charAt(i) == 'E') {
				contador[1] = contador[1] + 1;
			}
			if (c.charAt(i) == 'i' || c.charAt(i) == 'I') {
				contador[2] = contador[2] + 1;
			}
			if (c.charAt(i) == 'o' || c.charAt(i) == 'O') {
				contador[3] = contador[3] + 1;
			}
			if (c.charAt(i) == 'u' || c.charAt(i) == 'U') {
				contador[4] = contador[4] + 1;
			}
		}
		for (int i = 0; i < contador.length; i++) {
			if (i == 0) {
				System.out.println("Número de a's " + contador[i]);
			}
			if (i == 1) {
				System.out.println("Número de e's " + contador[i]);
			}
			if (i == 2) {
				System.out.println("Número de i's " + contador[i]);
			}
			if (i == 3) {
				System.out.println("Número de o's " + contador[i]);
			}
			if (i == 4) {
				System.out.println("Número de u's " + contador[i]);
			}
		}
	}// del main
}
