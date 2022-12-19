package _04ordenando;
import java.util.Comparator;

class NombreComparator implements Comparator<Cuenta> {
	public int compare(Cuenta c1, Cuenta c2) {
		 return c1.getNombre().compareTo(c2.getNombre());
	}

}
