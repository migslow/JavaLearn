package ej05;

import java.util.ArrayList;

public class ArrayListCompañero {
	ArrayList<Compañero> lista = new ArrayList<Compañero>();
	
	public Compañero anyadirCompa(Compañero c) {
		lista.add(c);
		return c;
	}
	
	public void mostrarLista() {
		for(Compañero c : lista) {
			System.out.println(c);
		}
	}
}
