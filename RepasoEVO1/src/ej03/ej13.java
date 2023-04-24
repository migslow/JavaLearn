package ej03;

import java.util.Scanner;

public class ej13 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la frase: ");
		String f = s.nextLine();
		int[] contador = new int[5];
		for (int i = 0; i < f.length(); i++) {
			if (f.charAt(i) == 'a' || f.charAt(i) == 'A') {
				contador[0] = contador[0] + 1;
			}
			if (f.charAt(i) == 'e' || f.charAt(i) == 'E') {
				contador[1] = contador[1] + 1;
			}
			if (f.charAt(i) == 'i' || f.charAt(i) == 'I') {
				contador[2] = contador[2] + 1;
			}
			if (f.charAt(i) == 'o' || f.charAt(i) == 'O') {
				contador[3] = contador[3] + 1;
			}
			if (f.charAt(i) == 'u' || f.charAt(i) == 'U') {
				contador[4] = contador[4] + 1;
			}
		}

		for (int i = 0; i < contador.length; i++) {
			if (contador[i] == 0) {
				System.out.println("\nNumero de a's: " + contador[i]);
			}
			if (contador[i] == 1) {
				System.out.println("\nNumero de e's: " + contador[i]);
			}
			if (contador[i] == 2) {
				System.out.println("\nNumero de i's: " + contador[i]);
			}
			if (contador[i] == 3) {
				System.out.println("\nNumero de o's: " + contador[i]);
			}
			if (contador[i] == 4) {
				System.out.println("\nNumero de u's: " + contador[i]);
			}
		}

	}

}
