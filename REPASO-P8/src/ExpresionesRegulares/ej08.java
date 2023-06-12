package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar una matricula de un coche con formato 0000XXX
 */

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la matricula de un coche: ");
		String matricula = s.nextLine();
		if (matricula.matches("^[\\d]{4}[A-Z]{3}")) {
			System.out.println("La matricula es valida");
		} else {
			System.out.println("La matricula no es valida");
		}

	}

}
