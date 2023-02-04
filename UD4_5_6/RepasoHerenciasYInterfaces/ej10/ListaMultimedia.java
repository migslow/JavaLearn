package ej10;

import java.util.ArrayList;

public class ListaMultimedia {
	ArrayList<Multimedia> lista = new ArrayList<Multimedia>();

	public void crearObjeto(Multimedia m) {
		lista.add(m);
	}

	public int cuentaPrestados() {
		int total = 0;
		for(Multimedia m : lista) {
			if(m instanceof DiscoPrestable) {
				if(((DiscoPrestable) m).prestado()) {
					total++;
				}
			}
		}
		return total;
	}

	public void mostrarInformacion() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
