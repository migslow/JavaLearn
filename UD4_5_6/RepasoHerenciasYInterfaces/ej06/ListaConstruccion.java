package ej06;

import java.util.ArrayList;

public class ListaConstruccion {
	ArrayList<Construccion> lista = new ArrayList<Construccion>();

	public void crearConstruccion(Construccion c) {
		lista.add(c);
	}

	public void mostrarInformacion() {
		for (Construccion c : lista) {
			System.out.println(c);
		}
	}
}
