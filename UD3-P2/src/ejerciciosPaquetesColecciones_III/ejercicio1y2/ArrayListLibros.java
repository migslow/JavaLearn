package ejerciciosPaquetesColecciones_III.ejercicio1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Repaso ArrayList

public class ArrayListLibros {
	private ArrayList<Libro> lista = new ArrayList<Libro>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int length() {
		return lista.size();
	}

	public int buscar(String parte) {
		int i = 0;
		boolean encontrado = false;
		while ((i < lista.size()) && (!encontrado)) {
			if ((lista.get(i).getTitulo().toUpperCase().indexOf(parte.toUpperCase())) != -1)
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}

	public String buscarTodos(String parte) {
		String encontrados = "Libros que contienen la cadena " + parte + ": " + "\n\n";
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getTitulo().toLowerCase().contains(parte.toLowerCase())) {
				encontrados = encontrados + lista.get(i) + "\n-----------------------\n";
			}
		}
		return encontrados;
	}

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

	public Libro recuperar(int pos) {
		if ((pos < 1) || (pos > lista.size())) {
			return null;
		}
		return lista.get(pos - 1);
	}

	public String toString() {
		String cad = lista.size() + " Elementos de la lista:\n\n";
		for (int i = 0; i < lista.size(); i++)
			cad += lista.get(i) + "\n-----------------------------------------------\n";
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
}
