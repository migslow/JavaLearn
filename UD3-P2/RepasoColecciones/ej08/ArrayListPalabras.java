package ej08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPalabras {

	static Scanner s = new Scanner(System.in);

	ArrayList<String> lista = new ArrayList<String>();

	public void anyadirPalabra() {
		System.out.println("Introduce 10 palabras por teclado: ");
		int contador = 0;
		do {
			String p = s.next();
			lista.add(p);
			contador++;
		} while (contador <= 10);
	}
	
	public void ordenarPalabras() {
		Collections.sort(lista);
	}

	public void mostrarLista() {
		for (String p : lista) {
			System.out.print(p + " - ");
		}
	}
}
