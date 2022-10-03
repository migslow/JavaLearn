package ejercicios1;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un caracter alfanumerico: ");
		char c = s.next().charAt(0);
		if (c >= 48 && c <= 57) {
			System.out.println("El caracter es un digito");
		} else {
			System.out.println("El caracter es una letra ");
			if (c >= 65 && c <= 90) {
				System.out.print("El caracter es una letra en mayuscula");
			} else if (c >= 97 && c <= 122) {
				System.out.print("El caracter es una letra en minuscula");
			}
		}

	}

}
