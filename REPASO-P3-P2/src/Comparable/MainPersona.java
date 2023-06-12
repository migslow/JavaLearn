package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainPersona {
	public static void main(String[] args) {
		ArrayList<Persona> lista = new ArrayList<Persona>();
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("María", 25);
        Persona persona3 = new Persona("Pedro", 35);

        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);

        Collections.sort(lista);

        for (Persona persona : lista) {
            System.out.println(persona);
        }
	}
}
