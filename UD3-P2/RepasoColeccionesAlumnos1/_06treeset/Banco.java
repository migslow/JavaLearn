package _06treeset;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Banco {
	TreeSet<Cuenta> listaCuentas = new TreeSet<Cuenta>(new NombreComparator());

	public int tamanyo() {
		return listaCuentas.size();
	}

	public void annadirCuenta(Cuenta c) {
		listaCuentas.add(c);
	}

	public boolean borrarCuenta(Cuenta c) {
		return listaCuentas.remove(c);

	}

	public boolean borrarCuentaPorNumero(long c) {
		for (Cuenta c1 : listaCuentas) {
			if (c1.getNumero() == c) {
				listaCuentas.remove(c1);
				return true;
			}
		}
		System.out.println("No se puede borrar la cuenta");
		return false;
	}

	public boolean contieneCuenta(Cuenta c) {
		return listaCuentas.contains(c);
	}

	public boolean contieneCuentaMejorado(Cuenta c) {
		for (Cuenta c1 : listaCuentas) {
			if (c1.equals(c)) {
				return true;
			}
		}
		return false;
	}

	public String buscarPorNombre(String n) {
		String encontrados = "Todos los nombres en contrados por " + n + ": ";
		for (Cuenta c1 : listaCuentas) {
			if (c1.getNombre().toLowerCase().contains(n.toLowerCase())
					&& c1.getNombre().toUpperCase().contains(n.toUpperCase())) {
				encontrados = encontrados + "\n" + c1 + "\n--------------------------------------------";
			}
		}
		return encontrados;

	}

	/*
	public void ordenarPorNombreNatural() {
		Collections.sort(listaCuentas);
	}

	public void ordenarPorNombre() {
		Collections.sort(listaCuentas, new NombreComparator());
	}
	*/
	public void mostrarCuentas() {
		String mensaje = tamanyo() + " Elementos en la lista\n";
		for (Cuenta c1 : listaCuentas) {
			mensaje = mensaje + c1 + "\n------------------------------------------------\n";
		}
		System.out.println(mensaje);
	}// de mostrarCuentas

}