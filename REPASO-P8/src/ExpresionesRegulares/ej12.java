package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar numero real.
 */

public class ej12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero real: ");
		String real = s.nextLine();
		if (real.matches("^[\\d]+\\.[\\d]+")) {
			System.out.println("El numero real es valido");
		} else {
			System.out.println("El numero real no es valido");
		}
	}

}
