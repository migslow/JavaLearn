package ejerciciosOrdenacion;

import java.util.Scanner;

public class ej01 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la dimension del vector: ");
		int n = s.nextInt();
		int[] vector = new int[n];
		rellenar(vector);
		posicion(vector);
	}

	public static void rellenar(int[] v) {
		for (int i = 0; i < v.length; i++) {
			int numeros = (int) (Math.random() * 1000);
			System.out.print(numeros + " - ");
		}
	}

	public static void posicion(int[] v) {
		int pos = v[0];
		int contador = 0;
		System.out.print("\nIndica el numero que estas buscando: ");
		int n = s.nextInt();
		for (int i = 0; i < v.length; i++) {
			if(i == n) {
				System.out.println(n + " se encuentra en la posicion " + v[i]);
			} else {
				System.out.println(-1);
			}
		}
	}
}
