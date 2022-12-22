import java.util.Comparator;

public class edadComparator implements Comparator<Caballo> {

	@Override
	public int compare(Caballo o1, Caballo o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
