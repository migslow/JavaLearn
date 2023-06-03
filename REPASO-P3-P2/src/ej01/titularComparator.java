package ej01;

import java.util.Comparator;

public class titularComparator implements Comparator<CuentaBancaria> {

	@Override
	public int compare(CuentaBancaria o1, CuentaBancaria o2) {
		return o1.getTitular().compareToIgnoreCase(o2.getTitular());
	}

}
