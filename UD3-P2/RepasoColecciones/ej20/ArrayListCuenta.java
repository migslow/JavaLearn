package ej20;

import java.util.ArrayList;

public class ArrayListCuenta {
	ArrayList<Cuenta> lista = new ArrayList<Cuenta>();

	public int tamanyo() {
		return lista.size();
	}

	public Cuenta crearCuenta(Cuenta c) {
		lista.add(c);
		return c;
	}

	public int ingresos(long cuenta, int cantidad) {
		int total = 0;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == cuenta) {
				lista.get(i).setCantidad(lista.get(i).getCantidad() + cantidad);
				total = total + lista.get(i).getCantidad();
				System.out.println("La cantidad ingresada es: " + cantidad);
			}
		}
		return total;
	}
	
	public int cargos(long cuenta, int cantidad) {
		int total = 0;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == cuenta) {
				lista.get(i).setCantidad(lista.get(i).getCantidad() - cantidad);
				total = total + lista.get(i).getCantidad();
				System.out.println("La cantidad ingresada es: " + cantidad);
			}
		}
		return total;
	}

	public int transferencia(long cuentaOrigen, long cuentaDestino, int cantidad) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumero() == cuentaOrigen) {
				cargos(cuentaOrigen, cantidad);
				ingresos(cuentaDestino, cantidad);
			}
		}
		return cantidad;
	}

	public void mostrarLista() {
		for (Cuenta c : lista) {
			System.out.println(c);
		}
	}

	public void movimientos() {
		
	}
}
