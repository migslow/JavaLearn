package ejerciciosPaquetesColecciones_III.ejercicio3y4;

import java.util.HashSet;

import _02colecciones1.Lista;

public class MainHashSetLibros {

	public static HashSet<Libro> lista = new HashSet<Libro>();

	public static void main(String args[]) {

		Libro l1 = new Libro("Introducci�n a Java", new Persona(435762, 31, "Javier", "Hernandez Perez"),
				"0-13-031997-X", 546, 3, "Prentice-Hall", "Madrid-Espa�a", new Fecha(16, 11, 2001));
		Libro l2 = new Libro("Beginning Java", new Persona(435762, 31, "Javier", "Hernandez Perez"), "0-13-031997-X",
				1235, 3, "Addison", "Madrid-Espa�a", new Fecha(16, 11, 2001));
		Libro l3 = new Libro("Avanzado c#", new Persona(435762, 31, "Javier", "Hernandez Perez"), "0-13-031997-X", 123,
				3, "McGraw-Hill", "Madrid-Espa�a", new Fecha(16, 11, 2001));

		System.out.println("Libros añadidos a la lista");
		System.out.println(lista.add(l1));
		System.out.println(lista.add(l2));
		System.out.println(lista.add(l3));
		System.out.println("\nLa lista esta vacia?");
		System.out.println(lista.isEmpty());
		System.out.println("\nCuantos elementos tiene la lista?");
		System.out.println(lista.size());
	}

	public String buscarLibro(String titulo) {
		String elementos = "Libros encontrados por el titulo " + titulo + "\n";
		for(int i = 0; i < lista.size();i++) {
			if(lista.contains(titulo.toLowerCase()) && lista.contains(titulo.toUpperCase())){
				elementos = elementos + lista.hashCode();
			}
		}
		return elementos;
	}
}