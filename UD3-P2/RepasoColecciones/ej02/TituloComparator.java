package ej02;

import java.util.Comparator;

public class TituloComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.dameTitulo().compareToIgnoreCase(o2.dameTitulo());
	}

}
