package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPersona {
	private HashSet<Persona> lista = new HashSet<Persona>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Persona anyadir(Persona p) {
		lista.add(p);
		return p;
	}

	public void buscarPorNombre(String nombre) {
		for (Persona p : lista) {
			if (p.getNombre().toLowerCase().contains(nombre.toLowerCase())
					&& p.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
				System.out.println(p); 
			}
		}
	}

	public void mostrarLista() {
		for (Persona p: lista) {
			System.out.println(p);
		}
	}

	public void mostrarIterator() {
		Iterator<Persona> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
