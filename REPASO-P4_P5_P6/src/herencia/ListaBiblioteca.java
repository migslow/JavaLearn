package herencia;

import java.util.LinkedList;

public class ListaBiblioteca {
	private LinkedList<Biblioteca> lista = new LinkedList<Biblioteca>();
	
	public boolean vacia() {
		return lista.isEmpty();
	}
	
	public int tamanyo() {
		return lista.size();
	}
	
	public Biblioteca anyadir(Biblioteca b) {
		lista.add(b);
		return b;
	}
	
	public int cuentaPrestados() {
		int prestados = 0;
		for(Biblioteca b : lista) {
			if(b instanceof Libro) {
				if(((Libro) b).prestado()) {
					prestados++;
				}
			}
		}
		return prestados;
	}
	
	public int publicacionesAnteriores(int anyo) {
		int cuenta = 0;
		for(Biblioteca b : lista) {
			if(b.getAnyo() < anyo) {
				cuenta++;
			}
		}
		return cuenta;
	}
	
	public void mostrarLista() {
		for(Biblioteca b : lista) {
			System.out.println(b);
		}
	}
}
