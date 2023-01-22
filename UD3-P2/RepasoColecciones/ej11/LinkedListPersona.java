package ej11;

import java.util.LinkedList;

public class LinkedListPersona {
	LinkedList<Persona> lista = new LinkedList<Persona>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Persona crearPersona(Persona p) {
		lista.add(p);
		return p;
	}

	public void retornarNombreGenero() {
		for (int i = 0; i < tamanyo(); i++) {
			System.out.println("Nombre: " + lista.get(i).getNombre() + " - " + "Genero: " + lista.get(i).getGenero());
		}
	}

	public void mediaEdad() {
		int total = 0;
		double media = 0;
		for (int i = 0; i < tamanyo(); i++) {
			total = total + lista.get(i).getEdad();
		}
		media = total / tamanyo();
		System.out.println("La media de las edades es de: " + media);
	}

	public void cantidadM() {
		int total = 0;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getGenero().toLowerCase().contains("masculino")
					&& lista.get(i).getGenero().toUpperCase().contains("MASCULINO")) {
				total++;
			}
		}
		System.out.println("Personas Masculinas: " + total);
		
	}
	
	public void cantidadF() {
		int total = 0;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getGenero().toLowerCase().contains("femenino")
					&& lista.get(i).getGenero().toUpperCase().contains("FEMENINO")) {
				total++;
			}
		}
		System.out.println("Personas Femeninas: " + total);
		
	}

}
