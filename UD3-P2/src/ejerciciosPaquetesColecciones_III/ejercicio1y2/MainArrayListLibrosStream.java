package ejerciciosPaquetesColecciones_III.ejercicio1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import _04ordenando_colecciones_java8.Usuario1;

public class MainArrayListLibrosStream {
	public static void main(String args[]) {
		Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
		Fecha f1 = new Fecha(16, 11, 2001);
		Libro l1 = new Libro("Introducci�n a Java", p1, "0-13-031997-X", 546, 3, "Prentice-Hall", "Madrid-Espa�a", f1);

		Libro l2 = new Libro("Beginning Java", p1, "0-13-031997-X", 1235, 3, "Addison", "Madrid-Espa�a", f1);
		Libro l3 = new Libro("Avanzado c#", p1, "0-13-031997-X", 123, 3, "McGraw-Hill", "Madrid-Espa�a", f1);

		ArrayListLibros a = new ArrayListLibros();
		System.out.println(a.vacia());
		a.insertarOrden(l1);
		a.insertarOrden(l2);
		a.insertarOrden(l3);
		System.out.println(a.buscarTodos("java"));
		System.out.println(
				a.contiene(new Libro("Beginning Java", p1, "0-13-031997-X", 546, 3, "Addison", "Madrid-Espa�a", f1))
						+ "\n");
		System.out.println(a);

		System.out.println("\nComparar por numeros de paginas");
		a.stream().sorted((x, y) -> x.getPaginas().compararPaginas(y.getPaginas()))
		.forEach(y -> y.mostrarDatos());
		
		System.out.println("\nComparar por titulo de los libros");
		a.compararTitulo();
		System.out.println(a);
		/*
		lista.add(new Usuario1("uno", 11));
		lista.add(new Usuario1("dos", 2));
		lista.add(new Usuario1("tres", 3));
		lista.add(new Usuario1("cuatro", 44));
		System.out.println("\n Imprimo el objeto lista directamente:");
		System.out.println(lista);
		System.out.println("\n Ahora ordenados por nombre...");
		lista.stream().sorted((x, y) -> x.getNombre().compareToIgnoreCase(y.getNombre()))
				.forEach(y -> y.mostrarDatos());
		System.out.println("\n y ahora ordenados por edad...");
		lista.stream().sorted((x, y) -> x.getEdad() - y.getEdad()).forEach(y -> y.mostrarDatos());
		System.out.println("\n y ahora LOS DEJO DEFINITIVAMENTE ORDENADOS POR NOMBRE...");
		lista = lista.stream().sorted((x, y) -> x.getNombre().compareToIgnoreCase(y.getNombre()))
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(lista);
		*/
	}
}