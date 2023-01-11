package proyecto1;

import java.util.LinkedList;

public class ListaMultimedia {

	LinkedList<Multimedia> lista;

	public ListaMultimedia() {
		lista = new LinkedList<Multimedia>();
	}

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
		for (Multimedia m : lista)
			total = total + m.getDuracion();
		return total;
	}
	
	public String buscarPorGenero(Disco g) {
		String mensaje = tamanyo() + " Todos los discos encontrados por " + g + ": ";
		for(Multimedia m : lista) {
			if(m.g)
		}
	}

	public void imprimeLista() {
		for (Multimedia m : lista)
			System.out.println(m + "\n");
	}

}
