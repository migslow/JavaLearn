package ej05;

import java.util.Comparator;

public class ConstructoresComparator implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getConstructores().compareToIgnoreCase(o2.getConstructores());
	}

}
