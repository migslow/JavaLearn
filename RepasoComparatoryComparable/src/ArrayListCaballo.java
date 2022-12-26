import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCaballo {

	ArrayList<Caballo> lista = new ArrayList<Caballo>();

	public void vacia() {
		lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public void insertar(Caballo c) {
		lista.add(c);
	}

	public boolean eliminar(int pos) {
		if (pos < 1 || pos > tamanyo()) {
			return false;
		} else {
			lista.remove(pos - 1);
			return true;
		}
	}

	public boolean recuperar(int pos) {
		if (pos < 1 || pos > tamanyo()) {
			return false;
		} else {
			lista.get(pos - 1);
			return true;
		}
	}

	public void ordenarPorEdad() {
		Collections.sort(lista, new edadComparator());
	}

	public void ordenarPorNombre() {
		Collections.sort(lista, new nombreComparator());
	}

	@Override
	public String toString() {
		String mensaje = tamanyo() + " Productos en la lista: \n-----------------------------------------\n";
		for (int i = 0; i < tamanyo(); i++) {
			mensaje = mensaje + lista.get(i) + "\n";
		}
		return mensaje;
	}

}
