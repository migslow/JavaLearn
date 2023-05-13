package ejOrdenacion;

import java.util.Arrays;

public class ej04 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		ordenarArray(numeros);
		System.out.println("\nLos numeros ordenados son: " + Arrays.toString(numeros));
	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 101);
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}

	public static void ordenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length - 1; j++) {
				int aux = v[j], auxSig = v[j + 1];
				if (aux > auxSig) {
					v[j] = auxSig;
					v[j + 1] = aux;
				}
			}
		}
	}

}
