

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el caracter: ");
		char n = s.next().charAt(0);
		int cDigitos = 0, cMayus = 0, cMinus = 0;
		while (n != 42) {
			if (n >= 48 && n <= 57) {
				cDigitos++;
			}
			if (n >= 65 && n <= 90) {
				cMayus++;
			}
			if (n >= 97 && n <= 122) {
				cMinus++;
			}
			n = s.next().charAt(0);
		}
		System.out.println("Hay " + cDigitos + " digitos");
		System.out.println("Hay " + cMayus + " minusculas");
		System.out.println("Hay " + cMinus + " mayusculas");

	}

}
