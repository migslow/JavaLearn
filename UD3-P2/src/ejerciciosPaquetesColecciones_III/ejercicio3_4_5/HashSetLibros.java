package ejerciciosPaquetesColecciones_III.ejercicio3_4_5;

import java.util.Collections;
import java.util.HashSet;

public class HashSetLibros {
	private HashSet<Libro> lista = new HashSet<Libro>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean eliminar(int pos) {
		if ((pos < 1) || (pos > lista.size()) || (vacia()))
			return false;
		else {
			lista.remove(pos - 1);
			return true;
		}
	}

	public boolean contiene(Libro l) {
		return lista.contains(l);
	}

	public void contieneTitulo(String titulo) {
		for (Libro libro : lista) {
			if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())
					&& libro.getTitulo().toUpperCase().contains(titulo.toUpperCase())) {
				System.out.println(libro);
			}
		}
	}

	public Libro insertar(Libro p) {
		lista.add(p);
		return p;
	}

	public String toString() {
		return "HashSetLibros [lista=" + lista + "]";
	}

	/*
	 * public Libro recuperar(int pos) { if ((pos < 1) || (pos > lista.size())) {
	 * return null; } return lista.get(pos - 1); }
	 * 
	 * public void compararPaginas() { Collections.sort(lista, new
	 * PaginasComparator()); System.out.
	 * println("Lista ordenada por el numero de paginas de todos los libros"); }
	 * 
	 * public void compararTitulo() { Collections.sort(lista, new
	 * TituloComparator());
	 * System.out.println("Lista ordenada por el titulo de todos los libros"); }
	 * 
	 * public void ordenarPorEditorial() { Collections.sort(lista); }
	 * 
	 * public void ordenarPorPaginas() { Collections.sort(lista, new
	 * PaginasComparator()); }
	 * 
	 * public void ordenarPorTitulo() { Collections.sort(lista, new
	 * TituloComparator()); }
	 * 
	 * 
	 * public void funcionesLambda() {
	 * System.out.println("\nComparar por paginas de los libros con Lambda");
	 * lista.stream().sorted((x, y) -> x.getPaginas() - (y.getPaginas())).forEach(y
	 * -> y.mostrarDatos());
	 * 
	 * System.out.println("\nComparar por titulo de los libros con Lambda");
	 * lista.stream().sorted((x, y) ->
	 * x.getTitulo().compareToIgnoreCase(y.getTitulo())) .forEach(y ->
	 * y.mostrarDatos()); }
	 */
}
