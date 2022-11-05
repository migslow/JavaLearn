package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

/*
 * Programa Java para leer la altura de N personas y calcular la altura media. 
 * Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media. 
 *  El valor de N se pide por teclado y debe ser entero positivo.
 */

public class ej07 {

	static Scanner s = new Scanner(System.in);
	static int n;
	static int[] personas = new int[n];

	public static void pedir() {
		System.out.println("Introduce la media de las personas: ");
		for (int i = 0; i < personas.length; i++) {
			System.out.print("Introduce el " + i + ": ");
			personas[i] = s.nextInt();
			if (personas[i] < 0) {
				System.out.println("Has introducido una nota negativa. Fin");
				System.exit(0);
			}
		}
		System.out.println("\nLas alturas introducidas son: ");
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]);
		}

	}

	public static double media(double m) {
		double suma = 0;
		for (int i = 0; i < personas.length; i++) {
			suma = suma + personas[i];
		}
		return suma / personas.length;
	}

	public static void main(String[] args) {
		System.out.println("Introduce el numero de personas: ");
		n = s.nextInt();
		
		pedir();
		System.out.println("La media de las personas es: " + media(0));

	}

}
