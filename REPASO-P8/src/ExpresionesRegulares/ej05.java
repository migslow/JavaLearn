package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar un código postal (5 cifras numéricas); ej--> 28080
 */

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el codigo postal: ");
		String postal = s.nextLine();
		if (postal.matches("[\\d]{5}")) {
			System.out.println("El codigo postal es valido");
		} else {
			System.out.println("El codigo postal no es valido");
		}

	}

}
