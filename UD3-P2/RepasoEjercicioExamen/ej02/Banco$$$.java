package ej02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Banco$$$ {

	HashSet<Cuenta> lista = new HashSet<Cuenta>();

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
		for (Cuenta y : lista) {
			if (y.getNumero() == c.getNumero()) {
				lista.add(c);
				return true;
			}
		}
		return false;
	}

	public boolean borrarCuenta(Cuenta c) {
		for (Cuenta y : lista) {
			if (y.getNumero() == c.getNumero()) {
				lista.remove(c);
				return true;
			}
		}
		return false;
	}

	public String buscarCuentaPorNumero(long n) {
		String mensaje = " Elementos de la lista encontrados por " + n + ": ";
		for (Cuenta y : lista) {
			if (y.getNumero() == n) {
				mensaje = mensaje + "\n" + y + "\n----------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public boolean ingreso(long n, double s) {
		for (Cuenta y : lista) {
			if (y.getNumero() == n) {
				y.setSaldo(y.getSaldo() + s);
				return true;
			}
		}
		return false;
	}

	public boolean retirar(long n, double s) {
		for (Cuenta y : lista) {
			if (y.getNumero() == n && y.getSaldo() >= n) {
				y.setSaldo(y.getSaldo() - s);
				return true;
			}
		}
		return false;
	}

	public void ordenacionNaturalNumeros() {
		ArrayList<Cuenta> l = new ArrayList<Cuenta>();
		for (Cuenta y : lista) {
			lista.add(y);
		}
		Collections.sort(l);
		for (Cuenta x : l) {
			System.out.println(x);
		}
	}

	public void mostrarElementos() {
		String mensaje = tamanyo() + " Elementos de la lista: ";
		for (Cuenta y : lista) {
			mensaje = mensaje + "\n" + y + "\n----------------------------------------------------------------";
		}
		System.out.println(mensaje);
	}

	public void mostrarIterator() {
		Iterator<Cuenta> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
