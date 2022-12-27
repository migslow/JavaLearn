package RepasoComparatorYComparable;
import java.util.Comparator;

public class velocidadComparator implements Comparator<Caballo>{

	@Override
	public int compare(Caballo o1, Caballo o2) {
		return (int) (o1.getVelocidad() - o2.getVelocidad());
	}

}
