package _03colecciones2_2;

import java.util.ArrayList;

public class ArrayListLista {
	private ArrayList<Persona> lista = new ArrayList<Persona>();

	public int tamanyo() {
		return lista.size();
	}

	public boolean vacia() {
		return lista.isEmpty();
	}

	public void insertar(Persona p) {
		lista.add(p);
	}

	public Persona recuperar(int pos) {
		if (pos < 1 || pos > tamanyo()) {
			return null;
		} else {
			return lista.get(pos - 1);
		}
	}

	public void eliminar(Persona p) {
		lista.remove(p);
	}

	public Persona borrarPersonaPosicion(int pos) {
		if (pos < 1 || pos > tamanyo()) {
			return null;
		} else {
			return lista.remove(pos - 1);
		}
	}

	public int buscarPersonaPorDNI(long num) {
		int posicion = -1;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).dameNif().dameDni() == num) {
				posicion = i + 1;
			}
		}
		return posicion;
	}

	public Persona borrarPersonaPorDNI(long num) {
		int posicion = buscarPersonaPorDNI(num);
		if (posicion == -1) {
			return null;
		}
		return borrarPersonaPosicion(posicion);
	}

	public String buscarApellido(String apellido) {
		String encontrados = "Lista de personas que contienen la cadena " + apellido + "\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).dameApellidos().toLowerCase().contains(apellido.toLowerCase())) {
				encontrados = encontrados + lista.get(i) + "\n";
			}
		}
		return encontrados;
	}

	public ArrayList<Persona> buscarPorApellido2(String apellido) {
		ArrayList<Persona> encontrados = new ArrayList<Persona>();
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).dameApellidos().toLowerCase().contains(apellido.toLowerCase())) {
				encontrados.add(lista.get(i));
			}
		}
		return encontrados;
	}

	public boolean cambiarEdad(long dni, int edad) {
		boolean cambiada = false;
		int posicion = buscarPersonaPorDNI(dni);
		Persona p;
		if (posicion != -1) {
			p = recuperar(posicion);
			p.ponEdad(edad);
			cambiada = true;
		}

		return cambiada;
	}

	public int buscarPersona(Persona p) {
		return (lista.indexOf(p));
	}

	@Override
	public String toString() {
		String cadena = tamanyo() + " personas en la lista: \n-----------------------\n";
		for (int i = 0; i < tamanyo(); i++) {
			cadena = cadena + lista.get(i) + "\n";
		}
		if (vacia()) {
			return "La lista de personas está vacia";
		} else {
			return cadena;
		}
	}

}
