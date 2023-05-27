package expresionesRegulares;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el dni: ");
		String dni = s.next();
		if (dni.matches("^[\\d]{8}[A-Z]{1}")) {
			System.out.println("El dni es valido");
		} else {
			System.out.println("El dni no es valido");
		}

	}

}
