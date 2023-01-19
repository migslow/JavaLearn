package ej09;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDisco {

	ArrayList<Disco> lista = new ArrayList<Disco>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean contiene(Disco c) {
		return lista.contains(c);
	}

	public boolean anyadirDisco(Disco c) {
		for (Disco d : lista) {
			if (d.getCodigo() == c.getCodigo()) {
				lista.add(c);
				return true;
			}
		}
		return false;
	}

	public boolean borrarDisco(Disco c) {
		for (Disco d : lista) {
			if (d.getCodigo() == c.getCodigo()) {
				lista.remove(c);
				return true;
			}
		}
		return false;
	}

	public String buscarPorTitulo(String t) {
		String mensaje = "\nElementos de la lista encontrados por " + t + ": ";
		for (Disco d : lista) {
			if (d.getTitulo().toLowerCase().contains(t.toLowerCase())
					&& d.getTitulo().toUpperCase().contains(t.toUpperCase())) {
				mensaje = mensaje + "\n" + d + "\n---------------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorAutor(String t) {
		String mensaje = "\nElementos de la lista encontrados por " + t + ": ";
		for (Disco d : lista) {
			if (d.getAutor().toLowerCase().contains(t.toLowerCase())
					&& d.getAutor().toUpperCase().contains(t.toUpperCase())) {
				mensaje = mensaje + "\n" + d + "\n---------------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorFormato(String f) {
		String mensaje = "\nElementos de la lista encontrados por " + f + ": ";
		for (Disco d : lista) {
			if (d.getFormato().toLowerCase().contains(f.toLowerCase())
					&& d.getFormato().toUpperCase().contains(f.toUpperCase())) {
				mensaje = mensaje + "\n" + d + "\n---------------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorGenero(String t) {
		String mensaje = "\nElementos de la lista encontrados por " + t + ": ";
		for (Disco d : lista) {
			if (d.getTitulo().toLowerCase().contains(t.toLowerCase())
					&& d.getTitulo().toUpperCase().contains(t.toUpperCase())) {
				mensaje = mensaje + "\n" + d + "\n---------------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorCodigo(int t) {
		String mensaje = "\nElementos de la lista encontrados por " + t + ": ";
		for (Disco d : lista) {
			if (d.getCodigo() == t) {
				mensaje = mensaje + "\n" + d + "\n---------------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorDuracion(double t) {
		String mensaje = "\nElementos de la lista encontrados por " + t + ": ";
		for (Disco d : lista) {
			if (d.getDuracion() == t) {
				mensaje = mensaje + "\n" + d + "\n---------------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public boolean cambiarDuracion(int d, double o) {
		for (Disco dis : lista) {
			if (dis.getCodigo() == d) {
				dis.setDuracion(dis.getDuracion() + o);
				return true;
			}
		}
		return false;
	}

	public void mostrarLista() {
		String mensaje = tamanyo() + " Elementos de la lista: ";
		for (Disco d : lista) {
			mensaje = mensaje + "\n" + d + "\n----------------------------------------------------------------";
		}
		System.out.println(mensaje);
	}

	public void mostrarIterator() {
		Iterator<Disco> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
