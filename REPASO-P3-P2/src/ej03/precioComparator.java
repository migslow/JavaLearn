package ej03;

import java.util.Comparator;

public class precioComparator implements Comparator<Tienda>{

	@Override
	public int compare(Tienda o1, Tienda o2) {
		return (int) (o1.getPrecio() - o2.getPrecio());
	}

}
