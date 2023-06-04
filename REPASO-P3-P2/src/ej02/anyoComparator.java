package ej02;

import java.util.Comparator;

public class anyoComparator implements Comparator<Coche>{

	@Override
	public int compare(Coche o1, Coche o2) {
		return o1.getAnyo() - o2.getAnyo();
	}


}
