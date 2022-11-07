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

	public static void leerArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	} // de leerArray

	public static void main(String[] args) {
		int[] tabla = new int[10];
		escribirArray(tabla);
		leerArray(tabla);
	} // del main

} // de la clase
