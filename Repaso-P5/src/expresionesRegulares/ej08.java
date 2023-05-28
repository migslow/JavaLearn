package expresionesRegulares;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el correo electronico: ");
		String c = s.next();
		if (c.matches("^[A-Za-z0-9+_.]+@[a-z.]+")) {
			System.out.println("El correo electronico es valido");
		} else {
			System.out.println("El correo electronico no es valido");
		}

	}

}
