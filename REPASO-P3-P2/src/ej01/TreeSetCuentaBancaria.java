package ej01;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCuentaBancaria implements Comparable<CuentaBancaria>{
	private TreeSet<CuentaBancaria> lista = new TreeSet<CuentaBancaria>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean contiene(CuentaBancaria c) {
		return lista.contains(c);
	}

	public CuentaBancaria anyadir(CuentaBancaria c) {
		lista.add(c);
		return c;
	}

	public String busquedaPorNumeroCuenta(int id) {
		String encontrado = "Cuenta encontrada por el id¡: " + id + "\n";
		for (CuentaBancaria c : lista) {
			if (c.getNumeroCuenta() == id) {
				encontrado = encontrado + c;
			}
		}
		return encontrado;
	}

	public boolean eliminarPorNumeroCuenta(int id) {
		for (CuentaBancaria c : lista) {
			if (c.getNumeroCuenta() == id) {
				lista.remove(c);
				return true;
			}
		}
		return false;
	}

	public boolean cambiarTitular(int id, String titular) {
		for (CuentaBancaria c : lista) {
			if (c.getNumeroCuenta() == id) {
				c.setTitular(titular);
				return true;
			}
		}
		return false;
	}
	
	public boolean cambiarEstado(int id, boolean activa) {
		for(CuentaBancaria c : lista) {
			if(c.getNumeroCuenta() ==  id) {
				c.setActiva(activa);
				return true;
			}
		}
		return false;
	}
	
	public int cuentasNoActivas() {
		int cuenta = 0;
		for(CuentaBancaria c : lista) {
			if(c.isActiva() == false) {
				cuenta++;
			}
		}
		return cuenta;
	}

	public void mostrarLista() {
		for (CuentaBancaria c : lista) {
			System.out.println(c);
		}
	}

	public void mostrarIterator() {
		Iterator<CuentaBancaria> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Override
	public int compareTo(CuentaBancaria o) {
		return 0;
	}
}
