package _02linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
	private LinkedList<Cuenta> listaCuentas = new LinkedList<Cuenta>();

	public int tamanyo() {
		return listaCuentas.size();
	}

	public void annadirCuenta(Cuenta c) {
		listaCuentas.add(c);
		System.out.println(c);
	}

	public boolean borrarCuenta(Cuenta c) {
		return listaCuentas.remove(c);

	}

	public boolean borrarCuentaPorNumero(long c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).getNumero() != c) {
				return false;
			}
		}
		// Borrar cuenta por n�mero de cuenta
		// NO HAY PROBLEMA EN NO USAR ITERATOR a la hora de recorrer listaCuentas,
		// PUES EN EL MOMENTO EN QUE LA ENCUENTRO PARO y DEVUELVO TRUE
		// La instrucci�n siguiente al bucle anterior se ejecutar� si no ha encontrado
		// la cuenta. Poner all� return false
		listaCuentas.remove(c);
		return true;

	} // de borrarCuentaPorNumero

	public boolean contieneCuenta(Cuenta c) {
		return listaCuentas.contains(c);

	} // de contieneCuenta

	public boolean contieneCuentaMejorado(Cuenta c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).equals(c)) {
				return true;
			}
		}
		return false;
	}

	public String buscarPorNombre(String n) {
		String mensaje = "Elementos de la lista encontrados por " + n + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).getNombre().toLowerCase().contains(n.toLowerCase())
					&& listaCuentas.get(i).getNombre().toUpperCase().contains(n.toUpperCase())) {
				mensaje = mensaje + "\n" + listaCuentas.get(i)
						+ "\n-----------------------------------------------------------------";
			}
		}
		return mensaje;
	}// de buscarPorNombre

	public void mostrarCuentas() {
		Iterator<Cuenta> it = listaCuentas.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}// de mostrarCuentas

}// de Banco
