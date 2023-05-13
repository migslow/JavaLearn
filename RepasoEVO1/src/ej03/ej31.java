package ej03;

import java.util.Scanner;

public class ej31 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] notas = new int[5];
		rellenarArray(notas);
		System.out.println("\nLa media es: " + media(notas));
		aprobados(notas);
		System.out.println("\nEl numero maximo es: " + maximo(notas));
		System.out.println("\nEl numero minimo es: " + minimo(notas));
	}

	public static void rellenarArray(int[] v) {
		System.out.println("Introduce notas hasta que introduzca un numero negativo: ");
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= 0) {
				System.out.println("Introduce la nota en la posicion [" + i + "]: ");
				v[i] = s.nextInt();
			}
			if (v[i] < 0)
				break;
		}

		for (int i = 0; i < v.length; i++) {
			System.out.println("Nota: " + v[i]);
		}
	}

	public static double media(int[] v) {
		double suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i];
		}
		return suma / v.length;
	}

	public static void aprobados(int[] v) {
		int aprobados = 0, suspensos = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 0) {
			}
			if (v[i] > 0 && v[i] < 5) {
				suspensos++;
			}
			if (v[i] >= 5) {
				aprobados++;
			}
		}
		System.out.println("El número de aprobados es " + aprobados);
		System.out.println("El número de suspensos es " + suspensos);
	}

	public static int maximo(int[] v) {
		int maximo = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > maximo) {
				maximo = v[i];
			}
		}
		return maximo;
	}

	public static int minimo(int[] v) {
		int minimo = 100;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < minimo) {
				minimo = v[i];
			}
		}
		return minimo;
	}

}
