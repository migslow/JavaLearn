package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar un número octal.
 */

public class ej10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero octal: ");
		String octal = s.nextLine();
		if (octal.matches("^[0-7]+")) {
			System.out.println("El numero octal es valido");
		} else {
			System.out.println("El numero octal no es valido");
		}
	}
}
