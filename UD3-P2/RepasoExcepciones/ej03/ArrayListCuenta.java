package ej03;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCuenta {

	ArrayList<CuentaBancaria> lista = new ArrayList<CuentaBancaria>();

	public CuentaBancaria crearCuenta(CuentaBancaria c) {
		lista.add(c);
		return c;
	}

	public void retirar(String n, int cantidad) {
		try {
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNombre().equals(n)) {
					if (lista.get(i).getSaldo() < cantidad) {
						throw new Exception("Saldo insuficiente");
					} else {
						lista.get(i).setSaldo(lista.get(i).getSaldo() - cantidad);
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void mostrar() {
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
