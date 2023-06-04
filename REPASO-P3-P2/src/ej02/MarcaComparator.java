package ej02;

import java.util.Comparator;

public class MarcaComparator implements Comparator<Coche>{

	@Override
	public int compare(Coche o1, Coche o2) {
		return o1.getMarca().compareToIgnoreCase(o2.getMarca());
	}

}
