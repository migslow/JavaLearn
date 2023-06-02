package ComparatorYcomparable;

import java.util.Comparator;

public class ComparatorTitulo implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
	}

}
