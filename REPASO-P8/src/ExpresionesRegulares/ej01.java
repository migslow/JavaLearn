package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Verificar si una cadena contiene solo dígitos.
 */

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la cadena: ");
		String cadena = s.nextLine();
		if (cadena.matches("\\d+")) {
			System.out.println("La cadena solo tiene numeros");
		} else {
			System.out.println("La cadena tiene caracteres alfanumericos");
		}

	}

}
