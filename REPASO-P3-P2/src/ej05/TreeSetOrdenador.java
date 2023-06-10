package ej05;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOrdenador {
	private TreeSet<Ordenador> lista = new TreeSet<Ordenador>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public boolean contiene(Ordenador o) {
		return lista.contains(o);
	}

	public Ordenador anyadir(Ordenador o) {
		lista.add(o);
		return o;
	}

	public String busquedaPorMarca(String marca) {
		String encontrados = "Ordenadores encontrados por la marca: " + marca + "\n";
		for (Ordenador o : lista) {
			if (o.getMarca().toLowerCase().contains(marca.toLowerCase())
					&& o.getMarca().toUpperCase().contains(marca.toUpperCase())) {
				encontrados = encontrados + o;
			}
		}
		return encontrados;
	}
	
	public boolean cambiarAlmacenamiento(int id, int al) {
		for(Ordenador o : lista) {
			if(o.getId() == id) {
				o.setAlmacenamiento(al);
				return true;
			}
		}
		return false;
	}
	/*
	public void ordenarAlmancenamiento() {
		Collections.sort(lista, new alComparator());
	}
	*/
	public void mostrarLista() {
		for (Ordenador o : lista) {
			System.out.println(o);
		}
	}
	

	public void mostrarIterator() {
		Iterator<Ordenador> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
