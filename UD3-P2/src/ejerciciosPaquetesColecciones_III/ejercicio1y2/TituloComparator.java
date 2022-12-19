package ejerciciosPaquetesColecciones_III.ejercicio1y2;

import java.util.Comparator;

public class TituloComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
		// return String.valueOf(o1.getTitulo()).compareTo(o2.getTitulo());
	}

}
