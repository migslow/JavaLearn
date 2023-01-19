package ej06;

import java.util.ArrayList;

public class ArrayListNumero {

	ArrayList<Numero> lista = new ArrayList<Numero>();

	public int saberTamanyo() {
		return lista.size();
	}

	public int tamanyoLista() {
		int nA = (int) (Math.random() * 20 + 10);
		System.out.println(nA);
		return nA;
	}

	public Numero anyadirNumero(Numero n) {
		if(tamanyoLista() > 0) {
			int NA = (int) (Math.random() * 100);
			lista.add(NA, n);	
		}
		return n;
	}

}
