package RepasoExamen;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce caracteres por teclado: ");
		int c = s.next().charAt(0);
		int Cdigito = 0, CMinis = 0, CMayus = 0;
		if (c == 42) {
			System.exit(0);
		}
		while (c != 42) {
			if (c >= 48 && c <= 57) {
				Cdigito++;
			}
			if (c >= 65 && c <= 90) {
				CMayus++;
			}
			if (c >= 97 && c <= 122) {
				CMinis++;
			}
			c = s.next().charAt(0);
		}
		System.out.println("Hay " + Cdigito + " digitos");
		System.out.println("Hay " + CMinis + " minusculas");
		System.out.println("Hay " + CMayus + " mayusculas");

	}

}
