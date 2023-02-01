package ej05;

import java.util.Comparator;

public class cvComparator implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getCv() - o2.getCv();
	}

}
