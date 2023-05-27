package expresionesRegulares;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el codigo postal: ");
		String p = s.next();
		if (p.matches("[\\d]{5}")) {
			System.out.println("El codigo postal es valido");
		} else {
			System.out.println("El codigo postal no es valido");
		}

	}

}
