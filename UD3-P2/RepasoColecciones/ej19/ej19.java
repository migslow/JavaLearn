package ej19;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ej19 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> lista1 = new HashMap<String, String>();
		HashMap<String, String> lista2 = new HashMap<String, String>();

		lista1.put("Rana", "En los tropicos y cerca de las zonas humedas y acuaticas");
		lista1.put("Salamandra", "Ecosistemas humedos");
		lista1.put("Sapo", "En cualquier sitio salvo el desierto y la Antartida");
		lista1.put("Triton", "America y Africa");

		lista2.put("Rana", "Larvas e insectos");
		lista2.put("Salamandra", "Pequeños crustaceos e insectos");
		lista2.put("Sapo", "Insectos, lombrices y pequeños roedores");
		lista2.put("Triton", "Insectos");

		System.out.println("Introduce el tipo de anfibio: ");
		String a = s.next();
		System.out.println("Habitat");
		if (lista1.containsKey(a)) {
			for (String s : lista1.keySet()) {
				if (lista1.get(s).equals(lista1.get(a))) {
					System.out.print(s + " - ");
				}
			}
		}

		System.out.println("\nAlimentacion");
		if (lista2.containsKey(a)) {
			System.out.println(lista2.values());
		}

	}

}
