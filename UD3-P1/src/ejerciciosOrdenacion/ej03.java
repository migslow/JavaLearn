package ejerciciosOrdenacion;

import java.util.Arrays;
import java.util.Scanner;

public class ej03 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la dimension del array: ");
		int dato = s.nextInt();
		String[] numeros = new String[dato];

		// numeros aleatorios
		for (int i = 0; i < numeros.length; i++) {
			int n = (int) (Math.random() * 21);
			System.out.print(n + " - ");
		}

		// comprobar si hay repetidos
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (i != j) {
					if (numeros[i] == numeros[j]) {
						numeros[i] = "";
					}
				}
			}
		}

		// mostrar el array de forma ascendente
		Arrays.sort(numeros);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
	}
}
