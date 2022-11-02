package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej06 {

	static Scanner s = new Scanner(System.in);

	static public void visualizar() {
		System.out.println("Introduce 10 numeros enteros seguidos y separados por un espacio: ");
		int n = s.nextInt();
		int[] numeros = new int[n];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento " + i + ": " + numeros[i]);
		}
	}

	public static void main(String[] args) {
		visualizar();
	}

}
