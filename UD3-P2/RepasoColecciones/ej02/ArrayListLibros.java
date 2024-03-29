package ej02;

import java.util.ArrayList;
import java.util.Collections;

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
			if ((lista.get(i).dameTitulo().toUpperCase().indexOf(parte.toUpperCase())) != -1)
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
			if (lista.get(i).dameTitulo().toLowerCase().contains(parte.toLowerCase())) {
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
	
	public void compararPorTitulo() {
		Collections.sort(lista, new TituloComparator());
		System.out.println("Todos los titulos ordenados: ");
	}
	
	public void compararPaginas() {
		Collections.sort(lista, new PaginasComparator());
		System.out.println("Todos los titulos ordenados por paginas: ");
	}

	public String toString() {
		String cad = lista.size() + " Elementos de la lista:\n\n";
		for (int i = 0; i < lista.size(); i++)
			cad += lista.get(i) + "\n-----------------------------------------------\n";
		return cad;
	}
}