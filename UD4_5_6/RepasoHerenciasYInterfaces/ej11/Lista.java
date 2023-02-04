package ej11;

import java.util.ArrayList;

public class Lista {
	ArrayList<ClaseB> lista = new ArrayList<ClaseB>();

	public void insertar(ClaseB b) {
		lista.add(b);
	}

	public int cuentaZ() {
		int cuenta = 0;
		for (ClaseB b : lista) {
			if (b instanceof ClaseZ) {
				cuenta++;
			}
		}
		return cuenta;
	}

	public void recorrer() {
		for (ClaseB b : lista) {
			System.out.println(b);
		}
	}

}
