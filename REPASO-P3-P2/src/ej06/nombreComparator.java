package ej06;

import java.util.Comparator;

public class nombreComparator implements Comparator<Ciudad>{

	@Override
	public int compare(Ciudad o1, Ciudad o2) {
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}
