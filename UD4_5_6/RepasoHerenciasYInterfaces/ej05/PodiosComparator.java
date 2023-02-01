package ej05;

import java.util.Comparator;

public class PodiosComparator implements Comparator<Piloto> {

	@Override
	public int compare(Piloto o1, Piloto o2) {
		return o1.getPodios() - o2.getPodios();
	}

}
