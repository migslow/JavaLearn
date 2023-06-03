package herencia;

import java.util.LinkedList;

public class ListaMultimedia {

	LinkedList<Multimedia> lista = new LinkedList<Multimedia>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Multimedia insertar(Multimedia m) {
		lista.add(m);
		return m;
	}

	public double duracionTotal() {
		double total = 0;
		for (Multimedia m : lista) {
			total = total + m.getDuracion();
		}
		return total;
	}

	public int buscarPorGenero(String genero) {
		int total = 0;
		for (Multimedia m : lista) {
			if (m instanceof Disco) {
				if (((Disco) m).getGenero().toLowerCase().contains(genero.toLowerCase())) {
					total++;
				}
			}
		}
		return total;
	}

	public int peliculasSinActriz() {
		int total = 0;
		for (Multimedia m : lista) {
			if (m instanceof Pelicula) {
				if (((Pelicula) m).getActrizPrincipal() == null) {
					total++;
				}
			}
		}
		return total;
	}

	public void imprimeLista() {
		for (Multimedia m : lista) {
			System.out.println(m);
		}
	}
}
