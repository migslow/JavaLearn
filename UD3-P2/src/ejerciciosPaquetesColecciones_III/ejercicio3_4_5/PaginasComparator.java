package ejerciciosPaquetesColecciones_III.ejercicio3_4_5;

import java.util.Comparator;

public class PaginasComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getPaginas() - o2.getPaginas();
		// return Integer.valueOf(o1.getPaginas()).compareTo(o2.getPaginas());
	}

}
