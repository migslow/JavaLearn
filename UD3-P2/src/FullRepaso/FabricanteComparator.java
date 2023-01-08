package FullRepaso;

import java.util.Comparator;

public class FabricanteComparator implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getFabricante().compareToIgnoreCase(o2.getFabricante());
	}

}
