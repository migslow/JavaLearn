package expresionesRegulares;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero de telefono: ");
		String cadena = s.next();
		if (cadena.matches("[\\d]{9}")) {
			System.out.println("El numero de telefono es valido");
		} else {
			System.out.println("El numero de telefono no es valido");
		}

	}

}
