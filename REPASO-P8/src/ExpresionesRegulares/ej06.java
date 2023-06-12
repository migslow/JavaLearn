package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar un número entero.
 */

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero entero: ");
		String numero = s.nextLine();
		if (numero.matches("^[\\d]+")) {
			System.out.println("Es un numero entero");
		} else {
			System.out.println("No es un numero entero");
		}
		
		

	}

}
