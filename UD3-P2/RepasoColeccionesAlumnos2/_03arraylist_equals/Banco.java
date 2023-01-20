package _03arraylist_equals;

//Diciembre 2019 - Alberto Carrera
//Repaso colecciones vistas hasta ahora

import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
	private ArrayList<Cuenta> listaCuentas = new ArrayList<Cuenta>();

	public int tamanyo() {
		return listaCuentas.size();
	}

	public void annadirCuenta(Cuenta c) {
		listaCuentas.add(c);
		System.out.println(c);
	}

	public boolean borrarCuenta(Cuenta c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).equals(c)) {
				listaCuentas.remove(c);
				return true;
			}
		}
		return false;

	} // de borrarCuenta

	public boolean borrarCuentaPorNumero(long c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).getNumero() == c) {
				listaCuentas.remove(c);
				return true;
			}
		}
		return false;

	}
// de borrarCuentaPorNumero

	public boolean contieneCuenta(Cuenta c) {
		return listaCuentas.contains(c);
	}// de contieneCuenta

	public boolean contieneCuentaMejorado(Cuenta c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).equals(c)) {
				return true;
			}
		}
		return false;
	}
//

	public String buscarPorNombre(String n) {
		String mensaje = "Elementos de la lista encotrados por " + n + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).getNombre().toUpperCase().contains(n.toUpperCase())
					&& listaCuentas.get(i).getNombre().toLowerCase().contains(n.toLowerCase())) {
				mensaje = mensaje + "\n" + listaCuentas.get(i)
						+ "\n------------------------------------------------------";
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
