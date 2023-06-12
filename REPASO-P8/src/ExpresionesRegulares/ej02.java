package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Verificar si una cadena contiene solo letras.
 */

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la cadena: ");
		String cadena = s.nextLine();
		if (cadena.matches("[a-zA-Z]+")) {
			System.out.println("La cadena solo tiene letras");
		} else {
			System.out.println("La cadena tiene caracteres alfanumericos");
		}

	}

}
