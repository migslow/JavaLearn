package ej23;

/*
 * Crea una clase llamada "País" con atributos "nombre" y "población".
Crea una clase llamada "EjercicioSet" donde se declaran dos objetos, uno de tipo TreeSet llamado "paísesOrdenados" y 
otro de tipo HashSet llamado "paísesSinOrden", ambos almacenan objetos de tipo País.
Crea 5 objetos de la clase País con nombres y poblaciones diferentes.
Utiliza el método "add" para agregar los objetos País a ambos sets.
Utiliza el método "size" para imprimir la cantidad de países en cada set.
Utiliza un ciclo for-each para imprimir cada uno de los países en cada set.
Utiliza el método "remove" para eliminar un país espec
 */

import java.util.HashSet;
import java.util.TreeSet;

public class ejercicioSet {

	TreeSet<Pais> paisesOrdenados = new TreeSet<Pais>();

	public int tamayo() {
		return paisesOrdenados.size();
	}

	public Pais crearPais(Pais p) {
		paisesOrdenados.add(p);
		return p;
	}

	public boolean eliminarPais(String n) {
		for (Pais p : paisesOrdenados) {
			if (p.getNombre().equals(n)) {
				paisesOrdenados.remove(n);
				return true;
			}
		}
		return false;
	}

	public void mostrarPaises() {
		String mensaje = tamayo() + " Elementos de la lista: ";
		for (Pais p : paisesOrdenados) {
			mensaje = mensaje + "\n" + p + "\n------------------------------------------------";
		}
		System.out.println(mensaje);
	}

	HashSet<Pais> paisesSinOrden = new HashSet<Pais>();
	
	public int tamayo1() {
		return paisesSinOrden.size();
	}

	public Pais crearPais1(Pais p) {
		paisesSinOrden.add(p);
		return p;
	}

	public boolean eliminarPais1(String n) {
		for (Pais p : paisesSinOrden) {
			if (p.getNombre().toLowerCase().contains(n.toLowerCase())
					&& p.getNombre().toUpperCase().contains(n.toUpperCase())) {
				paisesSinOrden.remove(n);
				return true;
			}
			
		}
		return false;
	}

	public void mostrarPaises1() {
		String mensaje = tamayo() + " Elementos de la lista: ";
		for (Pais p : paisesSinOrden) {
			mensaje = mensaje + "\n" + p + "\n------------------------------------------------";
		}
		System.out.println(mensaje);
	}
}
