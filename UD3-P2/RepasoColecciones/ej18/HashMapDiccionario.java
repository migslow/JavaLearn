package ej18;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDiccionario {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("caliente", "hot");
		dic.put("rojo", "red");
		dic.put("ardiente", "hot");
		dic.put("verde", "green");
		dic.put("agujetas", "stiff");
		dic.put("abrasador", "hot");
		dic.put("hierro", "iron");
		dic.put("grande", "big");

		boolean salir = false;
		do {
			System.out.println("Introduce la palabra: ");
			String p = s.next();
			System.out.println("Introduce una palabra y le dare los sinonimos " + p);
			if (dic.containsKey(p)) {
				for (String s : dic.keySet()) {
					if (dic.get(s).equals(dic.get(p))) {
						System.out.print(s + " - ");
					}
				}
			} else {
				System.out.println("No conozco sinonimos de esa palabra");
			}
		} while (!salir);

	}

}
