package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar un nombre, incluyendo nombres compuestos.
 */

public class ej13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un nombre con apellidos: ");
		String nombre = s.nextLine();
		if (nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}")) {
			System.out.println("El nombre es valido");
		} else {
			System.out.println("El nombre no es valido");
		}

	}

}
