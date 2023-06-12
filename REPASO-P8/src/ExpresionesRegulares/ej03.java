package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar un número de teléfono nacional sin espacios (9 cifras numéricas); ej--> 974243447
 */

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero telefonico nacional: ");
		String telefono = s.nextLine();
		if (telefono.matches("[\\d]{9}")) {
			System.out.println("El telefono nacional es valido");
		} else {
			System.out.println("El telefono nacional no es valido");
		}

	}

}
