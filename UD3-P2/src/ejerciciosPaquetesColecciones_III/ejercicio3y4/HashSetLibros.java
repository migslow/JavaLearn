package ejerciciosPaquetesColecciones_III.ejercicio3y4;

import java.util.HashSet;

public class HashSetLibros {
	private HashSet<Libro> lista = new HashSet<Libro>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean contiene(Libro p) {
		return lista.contains(p);
	}

	public void insertar(Libro p) {
		for (int i = 0; i < tamanyo(); i++) {
			lista.add(i);
		}
	}

	public boolean eliminar(int pos) {
		if ((pos < 1) || (pos > lista.size()) || (vacia()))
			return false;
		else {
			lista.remove(pos - 1);
			return true;
		}
	}
	
	public String buscarProductoCodigo(String titu) {
		String encontrados = "Buscando los libros por el titulo " + titu + "\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i). == titu) {
				encontrados = encontrados + lista.get(i) + "\n";
			}
		}
		return encontrados;
	}

	public String toString() {
		String cad = lista.size() + " Elementos de la lista:\n\n";
		for (int i = 0; i < lista.size(); i++)
			cad += lista.hashCode() + "\n-----------------------------------------------\n";
		return cad;
	}
}