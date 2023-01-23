package ej22;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetLibro {
	TreeSet<Libro> lista = new TreeSet<Libro>();

	public int tamanyo() {
		return lista.size();
	}

	public Libro crearLibro(Libro l) {
		lista.add(l);
		return l;
	}

	public void mostrarLista() {
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
