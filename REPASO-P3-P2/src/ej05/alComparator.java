package ej05;

import java.util.Comparator;

public class alComparator implements Comparator<Ordenador>{

	@Override
	public int compare(Ordenador o1, Ordenador o2) {
		return o1.getAlmacenamiento() - o2.getAlmacenamiento();
	}

}
