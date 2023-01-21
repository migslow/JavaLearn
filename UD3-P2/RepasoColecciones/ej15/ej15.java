package ej15;

import java.util.HashMap;
import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> acceso = new HashMap<String, String>();
		acceso.put("Miguel", "1234");

		int intentos = 0;
		do {
			for (String nombre : acceso.keySet()) {
				System.out.println("Introduce usuario: ");
				String respuesta = s.next();
				if (respuesta.equals(acceso.get(nombre))) {
					System.out.println("Has acertado el usuario");

				}
			}
			for (String contra : acceso.keySet()) {
				System.out.println("Introduce la contraseña: ");
				String respuesta = s.next();
				if (respuesta.equals(acceso.get(contra))) {
					System.out.println("Has acertado!!!!");
					System.exit(0);
				} else {
					System.out.println("No has introducido bien el usuario o la contraseña");
					intentos++;
				}
			}
		} while (intentos < 3);
		System.out.println("Lo siento, no tienes acceso al area restringida");
	}

}
