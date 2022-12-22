import java.util.Comparator;

public class nombreComparator implements Comparator<Caballo> {

	@Override
	public int compare(Caballo o1, Caballo o2) {
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}
