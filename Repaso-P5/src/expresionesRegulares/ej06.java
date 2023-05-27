package expresionesRegulares;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		String n = s.next();
		if (n.matches("^-?[\\d]+")) {
			System.out.println("El numero es un entero");
		} else {
			System.out.println("El numero no es un entero");
		}

		if (n.matches("^[\\d]+")) {
			System.out.println("Es un numero positivo");
		}

		if (n.matches("^-[\\d]+")) {
			System.out.println("Es un numero negativo");
		}

	}

}
