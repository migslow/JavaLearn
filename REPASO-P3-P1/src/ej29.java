import java.util.Arrays;

public class ej29 {

	/*
	 * Crea un array de números de 100 posiciones, que contendrá los números del 1
	 * al 100. Obtén la suma de todos ellos y la media.
	 */

	public static void main(String[] args) {
		int[] numeros = new int[100];
		rellenarArray(numeros);
		System.out.println("\nLa suma es: " + suma(numeros));
		System.out.println("La media es: " + media(numeros));
		System.out.println("\nLos numeros ordenados de forma ascendente: ");
		ordenarFormaAscendente(numeros);
		System.out.println("\nLos numeros ordenados de forma descendente: ");
		ordenarFormaDescendente(numeros);
	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) ((Math.random() * 101) + 1);
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}

	public static int suma(int[] v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i];
		}
		return suma;
	}

	public static double media(int[] v) {
		double media = 0;
		for (int i = 0; i < v.length; i++) {
			media = suma(v) / v.length;
		}
		return media;
	}

	public static void ordenarFormaAscendente(int[] v) {
		Arrays.sort(v);
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] != v[i + 1]) {
				System.out.print(v[i] + " - ");
			}
		}
	}

	public static void ordenarFormaDescendente(int[] v) {
		Arrays.sort(v);
		for (int i = v.length - 1; i > 0; i--) {
			if (v[i] != v[i - 1]) {
				System.out.print(v[i] + " - ");
			}
		}
	}

}
