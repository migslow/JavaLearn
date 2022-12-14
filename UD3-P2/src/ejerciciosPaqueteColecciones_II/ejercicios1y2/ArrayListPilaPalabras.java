package ejerciciosPaqueteColecciones_II.ejercicios1y2;

import java.util.ArrayList;

public class ArrayListPilaPalabras {

	private ArrayList<String> lista = new ArrayList<String>();

	public boolean pilaPalabrasVacia() {
		return lista.isEmpty();
	}

	public int NumeropilaPalabras() {
		return lista.size();
	}

	public void apilarPalabra(String p) {
		lista.add(p);
	}

	public String desapilarPalabra() {
		return lista.remove(lista.size() - 1);
	}

	public String obtenerPalabraCima() {
		return lista.get(lista.size() - 1);
	}

	@Override
	public String toString() {
		String mensaje;
		if (pilaPalabrasVacia()) {
			return "La lista de esta vacia";
		} else {
			mensaje = NumeropilaPalabras() + " Productos en la lista: \n-----------------------------------------\n";
			for (int i = 0; i < NumeropilaPalabras(); i++) {
				mensaje = mensaje + lista.get(i) + "\n";
			}
		}
		return mensaje;
	}

}
