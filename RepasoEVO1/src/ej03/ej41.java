package ej03;

import java.util.Scanner;

public class ej41 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la frase por teclado: ");
		String c = s.nextLine();
		int[] contador = new int[5];

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

	}

}
