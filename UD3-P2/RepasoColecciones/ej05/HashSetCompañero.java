package ej05;

import java.util.HashSet;

public class HashSetCompañero {

	HashSet<Compañero> lista = new HashSet<Compañero>();
	
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
