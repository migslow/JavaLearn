package ejerciciosPaquetesColecciones_III.ejercicio3y4;

import java.util.HashSet;
import java.util.Iterator;

import _02colecciones1.Lista;

public class MainHashSetLibros {

	public static void main(String args[]) {

		Libro l1 = new Libro("Introducción a Java", new Persona(435762, 31, "Javier", "Hernandez Perez"),
				"0-13-031997-X", 546, 3, "Prentice-Hall", "Madrid-Espa�a", new Fecha(16, 11, 2001));
		Libro l2 = new Libro("Beginning Java", new Persona(435762, 31, "Javier", "Hernandez Perez"), "0-13-031997-X",
				1235, 3, "Addison", "Madrid-Espa�a", new Fecha(16, 11, 2001));
		Libro l3 = new Libro("Avanzado c#", new Persona(435762, 31, "Javier", "Hernandez Perez"), "0-13-031997-X", 123,
				3, "McGraw-Hill", "Madrid-Espa�a", new Fecha(16, 11, 2001));

		HashSetLibros lista = new HashSetLibros();
		
		System.out.println("Libros añadidos a la lista");
		System.out.println(lista.insertar(l1));
		System.out.println(lista.insertar(l2));
		System.out.println(lista.insertar(l3));
		System.out.println("\nLa lista esta vacia?");
		System.out.println(lista.vacia());
		System.out.println("\nCuantos elementos tiene la lista?");
		System.out.println(lista.tamanyo());
		System.out.println("\nBuscar el titulo de un libro por una parte");
		System.out.println(lista.buscarLibro("java"));
		/*
		System.out.println("\nMuestra todos los libros");
		System.out.println(lista.imprmirLibros(null));
		*/
		
	}
}