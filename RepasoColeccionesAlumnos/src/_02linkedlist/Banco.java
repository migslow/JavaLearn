package _02linkedlist;

import java.util.LinkedList;

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
		String encontrados = "Cuentas encontradas por el numero: " + c + "\n\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).getNumero() == c) {
				listaCuentas.remove(c);
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
		String encontrados = "Todos los nombres en contrados por " + n + ": \n";
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas.get(i).getNombre().toLowerCase().contains(n.toLowerCase())) {
				encontrados = encontrados + listaCuentas.get(i)
						+ "\n-----------------------------------------------------\n";
			}
		}
		return encontrados;
	}

	public void mostrarCuentas() {
		String cad = tamanyo() + " Elementos de la lista:\n\n";
		for (int i = 0; i < listaCuentas.size(); i++)
			cad = cad + listaCuentas.get(i) + "\n-----------------------------------------------\n";
		System.out.println(cad);
	}

}// de Banco
