package ejerciciosPaquetesColecciones_III.ejercicio3_4_5;

import java.util.HashMap;

public class HashMapDiccionario {
	
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
	traducciones.put("gusta", "like");
	traducciones.put("luz", "light");
	traducciones.put("historia", "history");
	traducciones.put("coche", "car");
	
    System.out.println(traducciones);
    
	}
	
	public void traduccion(HashMap<String, String> palabra) {
		for (String clave : palabra.keySet()) {
			String valor = palabra.get(clave);
			System.out.println("Clave = " + clave + ", Valor = " + valor);
		}
	}
}
