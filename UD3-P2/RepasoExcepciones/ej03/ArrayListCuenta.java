package ej03;

import java.util.ArrayList;

public class ArrayListCuenta {

	ArrayList<CuentaBancaria> lista = new ArrayList<CuentaBancaria>();
	
	public CuentaBancaria crearCuenta(CuentaBancaria c) {
		lista.add(c);
		return c;
	}
}
