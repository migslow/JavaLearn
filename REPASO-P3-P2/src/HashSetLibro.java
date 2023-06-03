import java.util.HashSet;

public class HashSetLibro {
	private HashSet<Libro> lista = new HashSet<Libro>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Libro insertar(Libro p) {
		lista.add(p);
		return p;
	}

	public boolean contiene(Libro l) {
		return lista.contains(l);
	}

	public void contieneTitulo(String titulo) {
		for (Libro libro : lista) {
			if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())
					&& libro.getTitulo().toUpperCase().contains(titulo.toUpperCase())) {
				System.out.println(libro);
			}
		}
	}
	
	public void mostrarLista() {
		for(Libro l : lista) {
			System.out.println(l);
		}
	}

}
