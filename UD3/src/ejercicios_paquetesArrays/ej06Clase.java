package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej06Clase {

	public static void escribirArray(int[] v) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce los datos en el array: ");
		for (int i = 0; i < v.length; i++) {
			System.out.println("Elemento " + i + ": ");
			v[i] = s.nextInt();
		}
	} // de escribirArray

	public static void visualizarArray(int[] v, int min, int max) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
			if (v[i] == min) {
				System.out.print("minimo");
			}
			if (v[i] == max) {
				System.out.print("maximo");
			}
			System.out.println();
		}
	} // de leerArray

	public static int maximo(int[] v) {
		int max = v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i] > max) {
				max = v[i];
			}
		}
		return max;
	} // del maximo

	public static int minimo(int[] v) {
		int min = v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i] < min) {
				min = v[i];
			}
		}
		return min;
	} // del minimo

	public static void main(String[] args) {
		int[] tabla = new int[10];
		int min, max;
		escribirArray(tabla);
		max = maximo(tabla);
		min = minimo(tabla);
		visualizarArray(tabla, min, max);
	} // del main
} // de la clase
