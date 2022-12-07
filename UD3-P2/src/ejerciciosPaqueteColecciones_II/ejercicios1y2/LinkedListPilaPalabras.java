package ejerciciosPaqueteColecciones_II.ejercicios1y2;

import java.util.LinkedList;

import _03colecciones2.Libro;

public class LinkedListPilaPalabras {

	private LinkedList<Palabra> lista = new LinkedList<Palabra>();

	public boolean pilaPalabrasVacia() {
		return lista.isEmpty();
	}

	public int NumeropilaPalabras() {
		return lista.size();
	}

	public Palabra desapilarPalabra(Palabra s) {
		return lista.remove();
	}

	public Palabra agregarPalabra(Palabra p) {
		lista.add(p);
		return p;
	}

	public int buscar(String parte) {
		int i = 0;
		boolean encontrado = false;
		while ((i < lista.size()) && (!encontrado)) {
			if ((lista.get(i).damePalabra().toUpperCase().contains(parte.toUpperCase()))) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}

	public void imprimirLista() {
		for(Palabra p: lista) {
			System.out.println(lista);
		}
	}
}
