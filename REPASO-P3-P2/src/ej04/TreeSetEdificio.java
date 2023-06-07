package ej04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEdificio {
	private TreeSet<Edificio> lista = new TreeSet<Edificio>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public boolean contiene(Edificio d) {
		return lista.contains(d);
	}

	public int tamanyo() {
		return lista.size();
	}

	public Edificio anyadirEdificio(Edificio d) {
		lista.add(d);
		return d;
	}

	public boolean insertarEdificio(Edificio d) {
		for (Edificio dis : lista) {
			lista.add(d);
			return true;
		}
		return false;
	}

	public boolean eliminarEdificio(int id) {
		for (Edificio dis : lista) {
			if (dis.getId() == id) {
				lista.remove(dis);
				return true;
			}
		}
		return false;
	}

	public String buscarPorDireccion(String dire) {
		String encontrados = "Edificios encontrados en la direccion " + dire + ": " + "\n";
		for (Edificio d : lista) {
			if (d.getDireccion().toLowerCase().contains(dire.toLowerCase())
					&& d.getDireccion().toUpperCase().contains(dire.toUpperCase())) {
				encontrados = encontrados + d;
			}
		}
		return encontrados;
	}

	/*
	 * public void ordenarPorDireccion() { Collections.sort(lista, new
	 * direccionComparator()); }
	 * 
	 * public void ordenarPorNumeroPisos() { Collections.sort(lista, new
	 * numerosPisosComparator()); }
	 */
	
	public void mostrarLista() {
		for (Edificio d : lista) {
			System.out.println(d);
		}
	}

	public void mostrarIterator() {
		Iterator<Edificio> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
