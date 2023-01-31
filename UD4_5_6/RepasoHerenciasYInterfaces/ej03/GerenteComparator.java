package ej03;

import java.util.Comparator;

public class GerenteComparator extends EmpleadoComparator{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return Double.compare(((Gerente) o1).getBonificacion(), ((Gerente) o2).getBonificacion());

	}

}
