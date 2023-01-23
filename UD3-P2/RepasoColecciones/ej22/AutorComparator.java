package ej22;

import java.util.Comparator;

public class AutorComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getAutor().compareToIgnoreCase(o2.getAutor());
	}

}
