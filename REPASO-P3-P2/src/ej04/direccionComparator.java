package ej04;

import java.util.Comparator;

public class direccionComparator implements Comparator<Edificio>{

	@Override
	public int compare(Edificio o1, Edificio o2) {
		return o1.getDireccion().compareToIgnoreCase(o2.getDireccion());
	}

}
