package ej19;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ej19 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) { 
		HashMap<String, String> habitat = new HashMap<>();
		HashMap<String, String> alimentacion = new HashMap<>();

		habitat.put("salamandra", "Ecosistemas húmedos");
        habitat.put("rana", "Ecosistemas acuáticos y húmedos");
        habitat.put("sapo", "Ecosistemas húmedos y bosques");

        alimentacion.put("salamandra", "Pequeños crustáceos e insectos");
        alimentacion.put("rana", "Insectos, ranas pequeñas y peces pequeños");
        alimentacion.put("sapo", "Insectos y artrópodos");

		System.out.println("Introduce el tipo de anfibio: ");
		String tipo = s.next();
		
        if (habitat.containsKey(tipo) && alimentacion.containsKey(tipo)) {
            System.out.println("Hábitat: " + habitat.get(tipo));
            System.out.println("Alimentación: " + alimentacion.get(tipo));
        } else {
            System.out.println("Ese tipo de anfibio no existe");
        }

	}

}
