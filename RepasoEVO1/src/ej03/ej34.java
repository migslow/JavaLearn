package ej03;

import java.util.Scanner;

public class ej34 {

	public static void main(String[] args) {

		char[] contrasenya;
		Scanner s = new Scanner(System.in);
		System.out.print(
				"Introduzca la contraseña. Requisitos: \n" + "- La contraseña debe tener como mínimo 8 caracteres.\n"
						+ "- Como mínimo deben aparecer 2 dígitos \n" + "- Debe comenzar por una letra mayúscula \n");

		contrasenya = s.nextLine().toCharArray();

		// Comprobar requisitos
		if (contrasenya.length < 8) {
			System.out.println("La contraseña debe tener al menos 8 caracteres.");
			return;
		}
		if (!Character.isUpperCase(contrasenya[0])) {
			System.out.println("La contraseña debe comenzar por una letra mayúscula.");
			return;
		}
		int digitos = 0;
		for (char c : contrasenya) {
			if (Character.isDigit(c)) {
				digitos++;
			}
		}
		if (digitos < 2) {
			System.out.println("La contraseña debe tener al menos 2 dígitos.");
			return;
		}

		// Contraseña válida
		System.out.println("La contraseña es válida.");
	}
}
