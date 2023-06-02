package ComparatorYcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListLibro {
	private ArrayList<Libro> lista = new ArrayList<Libro>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Libro anayir(Libro l) {
		lista.add(l);
		return l;
	}

	public void mostrarLista() {
		for (Libro l : lista) {
			System.out.println(l);
		}
	}

	public String buscarPorCodigo(int id) {
		String encontrados = "Libro encontrado por id: " + id + "\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getId() == id) {
				encontrados = encontrados + lista.get(i) + "\n";
			}
		}
		return encontrados;
	}

	public String buscarPorTitulo(String titulo) {
		String encontrados = "Libros encontrados por el titulo: " + titulo + "\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getTitulo().toLowerCase().contains(titulo.toLowerCase())
					&& lista.get(i).getTitulo().toUpperCase().contains(titulo.toUpperCase())) {
				encontrados = encontrados + lista.get(i) + "\n";
			}
		}
		return encontrados;
	}
	
	public void ordenarPorTitulo() {
		Collections.sort(lista, new ComparatorTitulo());
	}
	
	public void ordenarPorPaginas() {
		Collections.sort(lista, new ComparatorPaginas());
	}

	public void mostrarIterator() {
		Iterator<Libro> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
