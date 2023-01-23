package ej21;

import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioArrayList {

	ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

	public boolean vacia() {
		return listaEstudiantes.isEmpty();
	}

	public int tamanyo() {
		return listaEstudiantes.size();
	}

	public Estudiante llenarLista(Estudiante e) {
		listaEstudiantes.add(e);
		return e;
	}

	public Estudiante agregarEstudiante(Estudiante e) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaEstudiantes.get(i).getNombre() != e.getNombre()) {
				listaEstudiantes.add(e);
			}
		}
		return e;
	}

	public String buscarEstudiante(String n) {
		String mensaje = "\nElementos de la lista encontrados por " + n + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (listaEstudiantes.get(i).getNombre().toLowerCase().contains(n.toLowerCase())
					&& listaEstudiantes.get(i).getNombre().toUpperCase().contains(n.toUpperCase())) {
				mensaje = mensaje + "\n" + listaEstudiantes.get(i) + "\n--------------------------------------";
			}
		}
		return mensaje;
	}

	public void modificarEstudiante(String n, int e) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaEstudiantes.get(i).getNombre().toLowerCase().contains(n.toLowerCase())
					&& listaEstudiantes.get(i).getNombre().toUpperCase().contains(n.toUpperCase())) {
				listaEstudiantes.get(i).setEdad(e);
			}
		}
	}
	
	public void eliminarEstudiante(String n) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaEstudiantes.get(i).getNombre().toLowerCase().contains(n.toLowerCase())
					&& listaEstudiantes.get(i).getNombre().toUpperCase().contains(n.toUpperCase())) {
				listaEstudiantes.remove(i);
			}
		}
	}
	
	public void mostrarLista() {
		Iterator it = listaEstudiantes.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
