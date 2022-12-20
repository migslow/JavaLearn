package ejerciciosPaquetesColecciones_III.ejercicio3y4;

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

	public String buscarLibro(String titulo) {
		String encontrados = "\nLibros encontrados por el titulo " + titulo + "\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.contains(titulo.toLowerCase().compareToIgnoreCase(titulo.toLowerCase()))
					&& lista.contains(titulo.toUpperCase().compareToIgnoreCase(titulo.toUpperCase()))) {
				encontrados = encontrados + lista.hashCode() + "\n-----------------------\n";
			}
		}
		return encontrados;
	}
/*
	public void imprimirLibros() {
		String encontrados = "Libros que se encuentran en la lista: " + "\n\n";
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getTitulo().toLowerCase().contains(parte.toLowerCase())) {
				encontrados = encontrados + lista.get(i) + "\n-----------------------\n";
			}
		}
		return encontrados;
	}
*/
	public boolean contiene(Libro p) {
		return lista.contains(p);
	}

	public boolean insertar(Libro p) {
		lista.add(p);
		return true;
	}

	public boolean eliminar(int pos) {
		if ((pos < 1) || (pos > lista.size()) || (vacia()))
			return false;
		else {
			lista.remove(pos - 1);
			return true;
		}
	}
/*
	public Libro recuperar(int pos) {
		if ((pos < 1) || (pos > lista.size())) {
			return null;
		}
		return lista.get(pos - 1);
	}

	public String toString() {
		String cad = lista.size() + " Elementos de la lista:\n\n";
		for (int i = 0; i < lista.size(); i++)
			cad = cad + lista.get(i) + "\n-----------------------------------------------\n";
		return cad;
	}

	public void compararPaginas() {
		Collections.sort(lista, new PaginasComparator());
		System.out.println("Lista ordenada por el numero de paginas de todos los libros");
	}

	public void compararTitulo() {
		Collections.sort(lista, new TituloComparator());
		System.out.println("Lista ordenada por el titulo de todos los libros");
	}

	public void ordenarPorEditorial() {
		Collections.sort(lista);
	}

	public void ordenarPorPaginas() {
		Collections.sort(lista, new PaginasComparator());
	}

	public void ordenarPorTitulo() {
		Collections.sort(lista, new TituloComparator());
	}
*/
	public void funcionesLambda() {
		System.out.println("\nComparar por paginas de los libros con Lambda");
		lista.stream().sorted((x, y) -> x.getPaginas() - (y.getPaginas())).forEach(y -> y.mostrarDatos());

		System.out.println("\nComparar por titulo de los libros con Lambda");
		lista.stream().sorted((x, y) -> x.getTitulo().compareToIgnoreCase(y.getTitulo()))
				.forEach(y -> y.mostrarDatos());
	}
}
