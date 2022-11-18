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
		boolean pos = false;
		int contador = 0;
		System.out.println("\nIntroduce el numero que quieres buscar: ");
		int dato = s.nextInt();
		while (contador < v.length) {
			if (v[contador] == dato) {
				pos = true;
			}
			contador++;
		}
		if (pos == false) {
			System.out.println("El numero " + dato + " no se encuentra en el array");
		} else {
			System.out.println("El numero " + dato + " se encuentra en el array");
		}
	}
}
