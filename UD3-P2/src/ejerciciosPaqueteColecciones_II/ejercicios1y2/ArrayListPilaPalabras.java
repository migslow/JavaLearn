package ejerciciosPaqueteColecciones_II.ejercicios1y2;

import java.util.ArrayList;

import _03colecciones2.Libro;

public class ArrayListPilaPalabras {

	private ArrayList<Palabra> lista = new ArrayList<Palabra>();

	public boolean pilaPalabrasVacia() {
		return lista.isEmpty();
	}

	public int NumeropilaPalabras() {
		return lista.size();
	}

	public Palabra desapilarPalabra(Palabra s) {
		return lista.remove(0);
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

}
