package ejercicios1;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce caracteres 1 a 1 y pulse Intro: ");
		int n = s.next().charAt(0);
		int Cdigito = 0, CMinis = 0, CMayus = 0;
		while (n != 42) {
			if (n >= 48 && n <= 57) {
				Cdigito++;
			}
			if (n >= 65 && n <= 90) {
				CMayus++;
			}
			if (n >= 97 && n <= 122) {
				CMinis++;
			}
			n = s.next().charAt(0);
		}
		System.out.println("Hay " + Cdigito + " digitos");
		System.out.println("Hay " + CMinis + " minusculas");
		System.out.println("Hay " + CMayus + " mayusculas");
	}
}
