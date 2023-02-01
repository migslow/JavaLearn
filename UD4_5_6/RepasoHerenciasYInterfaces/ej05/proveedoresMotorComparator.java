package ej05;

import java.util.Comparator;

public class proveedoresMotorComparator implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getProvedoresMotor().compareToIgnoreCase(o2.getProvedoresMotor());
	}

}
