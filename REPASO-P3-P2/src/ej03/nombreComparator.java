package ej03;

import java.util.Comparator;

public class nombreComparator implements Comparator<Tienda>{

	@Override
	public int compare(Tienda o1, Tienda o2) {
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}
