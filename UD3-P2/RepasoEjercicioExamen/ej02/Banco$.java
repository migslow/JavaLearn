package ej02;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Banco$ {

	LinkedList<Cuenta> lista = new LinkedList<Cuenta>();

	public int tamanyo() {
		return lista.size();
	}

	public boolean vacia() {
		return lista.isEmpty();
	}

	public boolean contiene(Cuenta c) {
		return lista.contains(c);
	}

	public Cuenta crearCuenta(Cuenta c) {
		lista.add(c);
		return c;
	}

	public boolean anyadirCuenta(Cuenta c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == c.getNumero()) {
				return false;
			}
		}
		lista.add(c);
		return true;
	}

	public boolean borrarCuenta(Cuenta c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == c.getNumero()) {
				lista.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean ingreso(long n, double s) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == n) {
				lista.get(i).setSaldo(lista.get(i).getSaldo() + s);
				return true;
			}
		}
		return false;
	}

	public boolean retirar(long n, double s) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == n && lista.get(i).getSaldo() >= s) {
				lista.get(i).setSaldo(lista.get(i).getSaldo() - s);
				return true;
			}
		}
		return false;
	}

	public String buscarCuentaPorNumero(long n) {
		String mensaje = " Elementos encontrados por " + n + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == n) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n--------------------------------------------------------";
			}
		}
		return mensaje;
	}
	
	public void ordenacionNaturalNumero() {
		Collections.sort(lista);
	}
	
	public void ordenacionComparatorNumero() {
		Collections.sort(lista, new NumeroComparator());
	}

	public void mostrarCuenta() {
		String mensaje = tamanyo() + " Elementos de la lista: ";
		for (int i = 0; i < tamanyo(); i++) {
			mensaje = mensaje + "\n" + lista.get(i) + "\n-----------------------------------------------";
		}
		System.out.println(mensaje);
	}

	public void mostrarCuentaIterator() {
		Iterator<Cuenta> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
