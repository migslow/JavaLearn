package ej11;

import java.util.TreeSet;

public class TreeSetPersona {
	TreeSet<Persona> lista = new TreeSet<Persona>();

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
		for (Persona p : lista) {
			System.out.println("Nombre: " + p.getNombre() + " - " + "Genero: " + p.getGenero());
		}
	}

	public void mediaEdad() {
		int total = 0;
		double media = 0;
		for (Persona p : lista) {
			total = total + p.getEdad();
		}
		media = total / tamanyo();
		System.out.println("La media de las edades es de: " + media);
	}

	public void cantidadM() {
		int total = 0;
		for (Persona p : lista) {
			if (p.getGenero().toLowerCase().contains("masculino")
					&& p.getGenero().toUpperCase().contains("MASCULINO")) {
				total++;
			}
		}
		System.out.println("Personas Masculinas: " + total);

	}

	public void cantidadF() {
		int total = 0;
		for (Persona p : lista) {
			if (p.getGenero().toLowerCase().contains("femenino") && p.getGenero().toUpperCase().contains("FEMENINO")) {
				total++;
			}
		}
		System.out.println("Personas Femeninas: " + total);

	}

}
