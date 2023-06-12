package ej06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCiudad {
	private HashSet<Ciudad> lista = new HashSet<Ciudad>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public boolean contiene(Ciudad c) {
		return lista.contains(c);
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean insertar(Ciudad c) {
		lista.add(c);
		return true;
	}

	public String busquedaPorPais(String pais) {
		String encontrados = "Ciudades encontradas por el pais: " + pais + "\n";
		for (Ciudad c : lista) {
			if (c.getPais().toLowerCase().contains(pais.toLowerCase())
					&& c.getPais().toUpperCase().contains(pais.toUpperCase())) {
				encontrados += c;
			}
		}
		return encontrados;
	}
	
	public String busquedaPorPaisPoblacion(String pais, int poblacion) {
		String encontrados = "Ciudades encontradas por el pais: " + pais + "\n";
		for (Ciudad c : lista) {
			if (c.getPais().toLowerCase().contains(pais.toLowerCase())
					&& c.getPais().toUpperCase().contains(pais.toUpperCase()) && c.getPoblacion() >= poblacion) {
				encontrados += c;
			}
		}
		return encontrados;
	}
	
	public boolean cambiarNombreCiudad(int id, String nombre) {
		for(Ciudad c: lista) {
			if(c.getId() == id) {
				c.setNombre(nombre);
				return true;
			}
		}
		return false;
	}
	
	public boolean aumentarPoblacion(int id, int poblacion) {
		for(Ciudad c : lista) {
			if(c.getId() == id) {
				c.setPoblacion(c.getPoblacion() + poblacion);
				return true;
			}
		}
		return false;
	}
	
	public void ordenacionNaturalNombre() {
		ArrayList<Ciudad> l = new ArrayList<Ciudad>();
		for (Ciudad y : lista) {
			lista.add(y);
		}
		Collections.sort(l);
		for (Ciudad x : l) {
			System.out.println(x);
		}
	}

	public void mostrarLista() {
		for (Ciudad c : lista) {
			System.out.println(c);
		}
	}

	public void mostrarIterator() {
		Iterator<Ciudad> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
