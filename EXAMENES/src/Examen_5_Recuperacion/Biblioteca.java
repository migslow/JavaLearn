package Examen_5_Recuperacion;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> lista = new ArrayList<Libro>();

	public Biblioteca() {
	}

	public void add(Libro l) {
		lista.add(l);
	}

	public ArrayList<Libro> getLista() {
		return lista;
	}

}
