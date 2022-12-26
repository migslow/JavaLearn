package ejerciciosPaquetesColecciones_III.ejercicio1y2;

import java.util.Collections;
import java.util.List;

public class MainArrayListLibros {
	public static void main(String args[]) {
		Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
		Fecha f1 = new Fecha(16, 11, 2001);
		Libro l1 = new Libro("Introducci�n a Java", p1, "0-13-031997-X", 546, 3, "Prentice-Hall", "Madrid-Espa�a", f1);

		Libro l2 = new Libro("Beginning Java", p1, "0-13-031997-X", 1235, 3, "Addison", "Madrid-Espa�a", f1);
		Libro l3 = new Libro("Avanzado c#", p1, "0-13-031997-X", 123, 3, "McGraw-Hill", "Madrid-Espa�a", f1);

		ArrayListLibros a = new ArrayListLibros();
		System.out.println(a.vacia());
		a.insertar(l1);
		a.insertar(l2);
		a.insertar(l3);
		System.out.println("\nEliminar y recuperar");
		a.eliminar(2);
		a.recuperar(2);
		System.out.println(a);
		System.out.println(a.buscarTodos("java"));
		System.out.println(a.contiene(new Libro("Beginning Java", p1, "0-13-031997-X", 546, 3, "Addison", "Madrid-Espa�a", f1)) + "\n");
		System.out.println(a);
		
		System.out.println("\nOrdenacion natural");
		a.ordenarPorEditorial();
		System.out.println(a);

		System.out.println("\nComparar por numeros de paginas");
		a.compararPaginas();
		System.out.println(a);

		System.out.println("\nComparar por titulo de los libros");
		a.compararTitulo();
		System.out.println(a);
		
		// Funciones Lambda
		a.funcionesLambda();
	}
}