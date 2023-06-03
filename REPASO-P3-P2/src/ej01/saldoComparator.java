package ej01;

import java.util.Comparator;

public class saldoComparator implements Comparator<CuentaBancaria>{

	@Override
	public int compare(CuentaBancaria o1, CuentaBancaria o2) {
		return (int) (o1.getSaldo() - o2.getSaldo());
	}

}
