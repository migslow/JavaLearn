package _01arraylist;

import java.util.ArrayList;

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
		return listaCuentas.remove(c);

	}

	public boolean borrarCuentaPorNumero(long c) {
		String encontrados = "Cuentas encontradas por el numero: " + c + "\n\n";
		for (Cuenta c1 : listaCuentas) {
			if (c1.getNombre().equals(c1)) {
				listaCuentas.remove(c1);
				return true;
			}
		}
		System.out.println("No he encontrado la cuenta");
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

	public void mostrarCuentas() {
		String mensaje = tamanyo() + " Elementos de la lista:";
		for (int i = 0; i < tamanyo(); i++) {
			mensaje = mensaje + "\n" + listaCuentas.get(i) + "\n--------------------------------------------";
		}
		System.out.println(mensaje);
	}

}
