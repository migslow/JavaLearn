package ej06;

import java.util.ArrayList;

public class ArrayListNumero {

	ArrayList<Integer> lista = new ArrayList<Integer>();

	public int tamanyo() {
		return lista.size();
	}

	public void anyadirNumero() {
		int size1 = (int) (Math.random() * 11 + 10);
		for (int i = 0; i < size1; i++) {
			int size2 = (int) (Math.random() * 101);
			lista.add(size2);
		}
		System.out.println(lista);

	}

	public int suma() {
		int suma = 0;
		for (int i = 0; i < tamanyo(); i++) {
			suma = suma + lista.get(i);
		}
		return suma;

	}

	public double media() {
		double media = 0;
		int suma = suma();
		int size = tamanyo();
		for (int i = 0; i < tamanyo(); i++) {
			media = suma / size;
		}
		return media;
	}

	public void maxMin() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
		for (int num : lista) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}
		System.out.println("El numero maximo es: " + max);
		System.out.println("El numero minimo es: " + min);
	}
}
