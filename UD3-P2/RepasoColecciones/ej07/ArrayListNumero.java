package ej07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListNumero {

	static Scanner s = new Scanner(System.in);

	ArrayList<Integer> lista = new ArrayList<Integer>();

	public void anyadirNumero() {
		System.out.println("Introduce 10 numeros por teclado: ");
		int contador = 0;
		do {
			int num = s.nextInt();
			lista.add(num);
			contador++;
		} while (contador <= 10);
	}
	
	public void ordenacionNatural() {
		Collections.sort(lista);
	}

	public void mostrarLista() {
		System.out.println("\nNumeros introducidos : ");
		for (Integer n : lista) {
			System.out.print(n + " - ");
		}
	}

}
