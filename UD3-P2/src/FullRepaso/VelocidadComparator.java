package FullRepaso;

import java.util.Comparator;

public class VelocidadComparator implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getVelocidadMaxima() - o2.getVelocidadMaxima();
	}

}
