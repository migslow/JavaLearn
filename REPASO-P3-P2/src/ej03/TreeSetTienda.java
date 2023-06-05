package ej03;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTienda {
	private TreeSet<Tienda> lista = new TreeSet<Tienda>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public boolean contiene(Tienda t) {
		return lista.contains(t);
	}

	public int tamanyo() {
		return lista.size();
	}

	public Tienda anyadirArticulo(Tienda t) {
		lista.add(t);
		return t;
	}

	public String buscarPorNombre(String nombre) {
		String encontrados = "Articulos encontrados por el nombre: " + nombre + "\n";
		for (Tienda t : lista) {
			if (t.getNombre().toLowerCase().contains(nombre.toLowerCase())
					&& t.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
				encontrados = encontrados + t;
			}
		}
		return encontrados;
	}

	public boolean eliminarPorId(int id) {
		for (Tienda t : lista) {
			if (t.getIdArticulo() == id) {
				lista.remove(t);
				return true;
			}
		}
		return false;
	}

	public boolean cambiarPrecio(int id, double precio) {
		for (Tienda t : lista) {
			if (t.getIdArticulo() == id) {
				t.setPrecio(precio);
				return true;
			}
		}
		return false;
	}

	public boolean comprarArticulo(int id) {
		for (Tienda t : lista) {
			if (t.getIdArticulo() == id) {
				t.setCantidad(t.getCantidad() - 1);
				return true;
			}
		}
		return false;
	}

	/*
	 * public void ordenarPorNombre() { Collections.sort(lista, new
	 * nombreComparator()); }
	 * 
	 * public void ordenarPorPrecio() { Collections.sort(lista, new
	 * precioComparator()); }
	 */

	public void mostrarLista() {
		for (Tienda t : lista) {
			System.out.println(t);
		}
	}

	public void mostrarIterator() {
		Iterator<Tienda> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
