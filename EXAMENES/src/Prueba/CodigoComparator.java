package Prueba;

import java.util.Comparator;

public class CodigoComparator implements Comparator<Codigo> {

	@Override
	public int compare(Codigo o1, Codigo o2) {
		return o1.getCodigo() - o2.getCodigo();
	}

}
