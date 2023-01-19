package ej11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSeguridad {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> acceso = new HashMap<String, String>();
		
		acceso.put("user1", "user1");

		int repeticiones = 0;
		do {
			int contador = 0;
			for (String contraseña : acceso.keySet()) {
				contador++;
				if (contador == 3) {
					System.out.println("Introduce la contraseña " + contraseña + " del user1");
					String respuesta = s.nextLine();
					respuesta = respuesta.toLowerCase();
					if (respuesta.equals(acceso.get(contraseña))) {
						System.out.println("Has acertado!!!!");
					}
				}
			}
			repeticiones++;
		} while (repeticiones < 3);
		s.close();
	}

}
