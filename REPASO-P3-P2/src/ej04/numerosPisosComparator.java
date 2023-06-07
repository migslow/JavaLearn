package ej04;

import java.util.Comparator;

public class numerosPisosComparator implements Comparator<Edificio> {

	@Override
	public int compare(Edificio o1, Edificio o2) {
		return o1.getNumeroPisos() - o2.getNumeroPisos();
	}

}
