package ej22;

import java.util.Comparator;

public class AnyoComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getAnyoPublicacion() - o2.getAnyoPublicacion();
	}

}
