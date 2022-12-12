package ejerciciosPaqueteColecciones_II.ejercicios1y2;

import java.util.LinkedList;

import _03colecciones2.Libro;
import _03colecciones2_2.Persona;

public class LinkedListPilaPalabras {

	private LinkedList<Palabra> lista = new LinkedList<Palabra>();

	public boolean pilaPalabrasVacia() {
		return lista.isEmpty();
	}

	public int NumeropilaPalabras() {
		return lista.size();
	}
	
	public boolean apilarPalabra(Palabra p) {
		return lista.add(p);
	}

	public boolean desapilarPalabra(Palabra p) {
		return lista.remove(p);
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
