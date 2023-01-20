package ej12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumero {
	
	static Scanner s = new Scanner(System.in);

	ArrayList<Numero> lista = new ArrayList<Numero>();

	public int tamanyo() {
		return lista.size();
	}

	public Numero crearNumero(Numero n) {
		lista.add(n);
		return n;
	}

	public void suma() {
		int total = 0;
		for (Numero n : lista) {
			total = total + n.getNumero();
		}
		System.out.println("\nEl total de los numeros es de: " + total);
	}
	
	public void media() {
		double media = 0;
		int total = 0;
		for(Numero n : lista) {
			total = total + n .getNumero();
		}
		if(total >= 0) {
			media = total / tamanyo();
		}
		System.out.println("La media de los numeros es: " + media);
	}
	
	public void maximo() {
		int max = 0;
		for(int i = 1; i < tamanyo();i++) {
			if(lista.get(i).getNumero() > max) {
				max = lista.get(i).getNumero();
			}
		}
		System.out.println("El numero maximo es: " + max);
	}
	
	public void minimo() {
		int min = 0;
		for(int i = 1; i < tamanyo();i++) {
			if(lista.get(i).getNumero() < min) {
				min = lista.get(i).getNumero();
			}
		}
		System.out.println("El numero minimo es: " + min);
	}
	
	public void mostrarLista() {
		String mensaje = "\n" + tamanyo() + " Elementos de la lista: ";
		for (Numero n : lista) {
			mensaje = mensaje + "\n" + n + "\n--------------------------------------------------";
		}
		System.out.println(mensaje);
	}

}
