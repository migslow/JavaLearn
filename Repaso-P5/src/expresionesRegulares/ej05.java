package expresionesRegulares;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre: ");
		String n = s.next();
		if (n.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$")) {
			System.out.println("El nombre es valido");
		} else {
			System.out.println("El nombre no es valido");
		}

	}

}
