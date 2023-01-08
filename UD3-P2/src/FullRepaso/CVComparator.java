package FullRepaso;

import java.util.Comparator;

public class CVComparator implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getCaballosPotencia() - o2.getCaballosPotencia();
	}

}
