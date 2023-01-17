package ej03;

import java.util.ArrayList;

public class Banco {

	ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
	
	public int tamanyo() {
		return lista.size();
	}
	
	public boolean vacia() {
		return lista.isEmpty();
	}
	
	public Cuenta crearCuenta(Cuenta c) {
		lista.add(c);
		return c;
	}
}
