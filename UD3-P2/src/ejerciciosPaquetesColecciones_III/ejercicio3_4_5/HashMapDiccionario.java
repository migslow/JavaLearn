package ejerciciosPaquetesColecciones_III.ejercicio3_4_5;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDiccionario {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> traducciones = new HashMap<String, String>();

		traducciones.put("coche", "car");
		traducciones.put("gato", "cat");
		traducciones.put("perro", "dog");
		traducciones.put("ciudad", "city");
		traducciones.put("mesa", "table");

		traducciones.put("movil", "smartphone");
		traducciones.put("casa", "house");
		traducciones.put("caballo", "horse");
		traducciones.put("camion", "truck");
		traducciones.put("mono", "monkey");

		traducciones.put("estilo", "style");
		traducciones.put("golpear", "hit");
		traducciones.put("aullido", "howl");
		traducciones.put("alma", "soul");
		traducciones.put("dradon", "dragon");

		traducciones.put("sentir", "feel");
		traducciones.put("gustar", "like");
		traducciones.put("luz", "light");
		traducciones.put("historia", "history");
		traducciones.put("coche", "car");

		int repeticiones = 0;
		int aciertos = 0;
		do {
			int x = (int) (Math.random() * 20 + 1);
			int contador = 0;

			for (String espanyol : traducciones.keySet()) {
				contador++;
				if (contador == x) {
					System.out.println("Introduce " + espanyol + " en ingles: ");
					String respuesta = s.nextLine();
					respuesta = respuesta.toLowerCase();
					if (respuesta.equals(traducciones.get(espanyol))) {
						System.out.println("Has acertado!!!!");
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
