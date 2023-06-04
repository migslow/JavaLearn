package ej02;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCoche {
	private LinkedList<Coche> lista = new LinkedList<Coche>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public boolean contiene(Coche c) {
		return lista.contains(c);
	}

	public Coche anyadir(Coche c) {
		lista.add(c);
		return c;
	}

	public String buscarPorMarca(String marca) {
		String encontrados = "Coches encontrados por la marca: " + marca + "\n";
		for (Coche c : lista) {
			if (c.getMarca().toLowerCase().contains(marca.toLowerCase())
					&& c.getMarca().toUpperCase().contains(marca.toUpperCase())) {
				encontrados = encontrados + c;
			}
		}
		return encontrados;
	}

	public boolean eliminarPorId(int id) {
		for (Coche c : lista) {
			if (c.getId() == id) {
				lista.remove(c);
				return true;
			}
		}
		return false;
	}
	
	public boolean cambiarPrecio(int id, double precio) {
		for(Coche c : lista) {
			if(c.getId() == id) {
				c.setPrecio(precio);
				return true;
			}
		}
		return false;
	}
	
	public void ordenarPorAnyo() {
		Collections.sort(lista, new anyoComparator());
	}
	
	public void ordenarPorMarca() {
		Collections.sort(lista, new MarcaComparator());
	}

	public void mostrarLista() {
		for (Coche c : lista) {
			System.out.println(c);
		}
	}

	public void mostrarIterator() {
		Iterator<Coche> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
