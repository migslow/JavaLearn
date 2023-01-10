package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la primera palabra: ");
		String p1 = s.nextLine();
		System.out.println("\nIntroduce la segunda palabra: ");
		String p2 = s.nextLine();

		char[] a1 = p1.toLowerCase().toCharArray();
		char[] a2 = p2.toLowerCase().toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		if (a1.length == a2.length) {
			if (Arrays.equals(a1, a2)) {
				System.out.println(p1 + " y " + p2 + " son palabras anagramas");
			}
		} else {
			System.out.println(p1 + " y " + p2 + " no son palabras anagramas");

		}

	}

}
