package ejOrdenacion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ej02 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		ordenacion(numeros);

	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion [" + i + "]: ");
			v[i] = s.nextInt();
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
		System.out.println("");
	}

	public static void ordenacion(int[] v) {
		HashSet<Integer> conjunto = new HashSet<Integer>();
		for (int i = 0; i < v.length; i++) {
			conjunto.add(v[i]);
		}
		Arrays.sort(v);
		System.out.println("\nLos números de forma ascendente son: " + Arrays.toString(v));
	}

}
