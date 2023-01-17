package ej02;

import java.util.Comparator;

public class NumeroComparator implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return (int) (o1.getNumero() - o2.getNumero());
	}

}
