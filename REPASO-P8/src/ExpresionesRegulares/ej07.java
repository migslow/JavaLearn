package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar DNI, 8 números y una letra al final.
 */

public class ej07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el dni: ");
		String dni = s.nextLine();
		if (dni.matches("^[\\d]{8}[A-Z]{1}")) {
			System.out.println("El dni es valido");
		} else {
			System.out.println("El dni no es valido");
		}

	}

}
