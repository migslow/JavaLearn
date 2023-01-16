package ej03;

import java.util.TreeSet;

public class TreeSetLibros {
	TreeSet<Libro> lista = new TreeSet<Libro>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int length() {
		return lista.size();
	}

	public String buscarTodos(String parte) {
		String encontrados = "Libros que contienen la cadena " + parte + ": " + "\n\n";
		for (Libro l : lista) {
			if (l.dameTitulo().toLowerCase().contains(parte.toLowerCase())
					&& l.dameTitulo().toUpperCase().contains(parte.toUpperCase())) {
				encontrados = encontrados + l + "\n-----------------------\n";
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
		for (Libro l : lista) {
			if ((pos < 1) || (pos > lista.size())) {
				return null;
			}
		}
		return null;

	}

	public String toString() {
		String cad = lista.size() + " Elementos de la lista:\n\n";
		for (Libro l : lista)
			cad = cad + l + "\n-----------------------------------------------\n";
		return cad;
	}
}