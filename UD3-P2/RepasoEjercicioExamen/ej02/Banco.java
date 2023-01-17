package ej02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Banco {

	ArrayList<Cuenta> lista = new ArrayList<Cuenta>();

	public int tamanyo() {
		return lista.size();
	}

	public boolean vacia() {
		return lista.isEmpty();
	}

	public boolean existeCuenta(Cuenta c) {
		return lista.contains(c);
	}

	public Cuenta crearCuenta(Cuenta c) {
		lista.add(c);
		return c;
	}

	public boolean annadirCuenta(Cuenta c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == c.getNumero()) {
				return false;
			}
		}
		return lista.add(c);
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

	public String buscarCuentaPorNumero(long n) {
		String mensaje = " Todos los elementos de la lista que contienen " + n + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == n) {
				mensaje = mensaje + "\n" + lista.get(i)
						+ "\n------------------------------------------------------------------------";
			}
		}
		return mensaje;
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

	public void ordenarPorNumero() {
		Collections.sort(lista);
		System.out.println("Todos los elementos de la lista ordenados por numero");
	}

	public void ordenarComparatorNumero() {
		Collections.sort(lista, new NumeroComparator());
		System.out.println("Todos los elementos de la lista ordenados por numero");
	}

	public void mostrarCuentas() {
		String mensaje = tamanyo() + " Elementos de la lista: ";
		for (int i = 0; i < tamanyo(); i++) {
			mensaje = mensaje + "\n" + lista.get(i)
					+ "\n--------------------------------------------------------------------------";
		}
		System.out.println(mensaje);
	}

	public void mostrarCuentasIterator() {
		Iterator<Cuenta> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println("\n" + it.next());
		}
	}
}
