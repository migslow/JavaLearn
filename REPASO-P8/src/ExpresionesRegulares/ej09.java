package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar un número binario.
 */

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero binario: ");
		String binario = s.nextLine();
		if (binario.matches("^[0|1]+")) {
			System.out.println("El numero binario en valido");
		} else {
			System.out.println("El numero binario no en valido");
		}

	}

}
