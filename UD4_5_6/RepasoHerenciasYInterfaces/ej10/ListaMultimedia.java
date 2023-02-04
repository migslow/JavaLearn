package ej10;

import java.util.ArrayList;

public class ListaMultimedia {
	ArrayList<Multimedia> lista = new ArrayList<Multimedia>();

	public void crearObjeto(Multimedia m) {
		lista.add(m);
	}

	public double duracionTotal() {
		double total = 0;
		for (Multimedia m : lista) {
			total = total + m.getDuracion();
		}
		return total;
	}

	public int generoTotal(String genero) {
		int total = 0;
		for (Multimedia m : lista) {
			if (m instanceof Disco) {
				if (((Disco) m).getGenero().toLowerCase().contains(genero.toLowerCase())
						&& ((Disco) m).getGenero().toUpperCase().contains(genero.toUpperCase())) {
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
