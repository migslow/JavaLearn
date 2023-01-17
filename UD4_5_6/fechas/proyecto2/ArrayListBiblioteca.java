package proyecto2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBiblioteca {

	ArrayList<Biblioteca> lista = new ArrayList<Biblioteca>();

	public int tamanyo() {
		return lista.size();
	}

	public Biblioteca anyadir(Biblioteca b) {
		lista.add(b);
		return b;
	}
	
	public boolean prestar(int c) {
		for(Biblioteca f : lista) {
			if(f instanceof Libro) {
				if(((Libro) f).prestar() == c) {
					
				}
			}
		}
	}

	public int cuentaPrestados() {
		int total = 0;
		for (Biblioteca f : lista) {
			if (f instanceof Libro) {
				if (((Libro) f).prestado() == true) {
					total++;
				}
			}
		}
		return total;
	}

	public int publicacionesAnteriores(int r) {
		int total = 0;
		for (Biblioteca f : lista) {
			if (f instanceof Revista) {
				if(f.getAñoPublicacion() < r) {
					total++;	
				}
			}
		}
		return total;
	}

	public void mostrarElementos() {
		Iterator<Biblioteca> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
