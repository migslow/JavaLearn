package ej04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaCantantesFamosos {
	
	public static Scanner s = new Scanner(System.in);
	
	ArrayList<CantanteFamoso> lista = new ArrayList<CantanteFamoso>();
	
	public int tamanyo() {
		return lista.size();
	}
	
	public CantanteFamoso anyadir(CantanteFamoso c) {
		lista.add(c);
		return c;
	}

	public void mostrarIterator() {
		Iterator<CantanteFamoso> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
