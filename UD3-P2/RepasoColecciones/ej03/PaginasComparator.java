package ej03;

import java.util.Comparator;

public class PaginasComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getPaginas() - o2.getPaginas();
	}

}
