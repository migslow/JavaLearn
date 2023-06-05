package HashMap;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Crea un mini-diccionario español-inglés que contenga, al menos, 10 palabras (con su
correspondiente traducción). Utiliza un objeto de la clase HashMap para almacenar las
parejas de palabras. El programa pedirá una palabra en español y dará la correspondiente
traducción en inglés.
Realiza otro programa que escoja al azar 5 palabras en español del mini-diccionario del
ejercicio anterior. El programa irá pidiendo que el usuario teclee la traducción al inglés de
cada una de las palabras y comprobará si son correctas. Al final, el programa deberá
mostrar cuántas respuestas son válidas y cuántas erróneas.
 */

public class diccionario {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("coche", "car");
		dic.put("gato", "cat");
		dic.put("perro", "dog");
		dic.put("ciudad", "city");
		dic.put("mesa", "table");

		dic.put("movil", "smartphone");
		dic.put("casa", "house");
		dic.put("caballo", "horse");
		dic.put("camion", "truck");
		dic.put("mono", "monkey");

		int repeticiones = 0;
		int aciertos = 0;
		int contador = 0;
		do {
			int x = (int) (Math.random() * 11);
			contador = 0;

			for (String espanyol : dic.keySet()) {
				contador++;
				if (contador == x) {
					System.out.println("Introduce " + espanyol + " en ingles: ");
					String respuesta = s.nextLine();
					respuesta = respuesta.toLowerCase();
					if (respuesta.equals(dic.get(espanyol))) {
						System.out.println("Has acertado!");
						aciertos++;
					}
				}
			}
			repeticiones++;
		} while (repeticiones < 5);
		System.out.println("Has puesto " + aciertos + " palabras bien.");
		s.close();
	}

}
