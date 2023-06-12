package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar un número hexadecimal.
 */

public class ej11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero hexadecimal: ");
		String hexa = s.nextLine();
		if (hexa.matches("^[0-9A-F]+")) {
			System.out.println("El numero hexadecimal es valido");
		} else {
			System.out.println("El numero hexadecimal no es valido");
		}

	}

}
