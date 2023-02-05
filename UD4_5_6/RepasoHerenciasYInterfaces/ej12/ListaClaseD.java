package ej12;

import java.util.ArrayList;

public class ListaClaseD {
	ArrayList<ClaseD> lista = new ArrayList<ClaseD>();

	public void crearObjeto(ClaseD d) {
		lista.add(d);
	}

	public void mostrarInformacion() {
		for (ClaseD d : lista) {
			System.out.println(d);
		}
	}
}
