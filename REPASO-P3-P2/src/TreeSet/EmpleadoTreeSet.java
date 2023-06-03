package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class EmpleadoTreeSet {
	private TreeSet<Empleado> lista = new TreeSet<Empleado>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Empleado anyadir(Empleado e) {
		lista.add(e);
		return e;
	}

	public void buscarPorNombre(String nombre) {
		for (Empleado e : lista) {
			if (e.getNombre().toLowerCase().contains(nombre.toLowerCase())
					&& e.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
				System.out.println(e);
			}
		}
	}
	
	public void mostrarLista() {
		for(Empleado e : lista) {
			System.out.println(e);
		}
	}
	


}
