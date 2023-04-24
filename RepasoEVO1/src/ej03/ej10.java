package ej03;

import java.util.Iterator;
import java.util.Scanner;

public class ej10 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		double[] numeros = new double[10];
		visualizarNotas(numeros);

		System.out.println("\nEl numero de aprobados es: " + aprobados(numeros));
		System.out.println("\nEl numero de suspendidos es: " + suspendidos(numeros));
		System.out.println("\nLa media es " + media(numeros));
	}

	public static void visualizarNotas(double[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce la nota en la posicion: [" + i + "]");
			numeros[i] = s.nextDouble();
		}

		System.out.println("\nLas notas introducidas: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "\n");
		}
	}

	public static int aprobados(double[] numeros) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 5) {
				contador++;
			}
		}
		return contador;
	}

	public static int suspendidos(double[] numeros) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 5) {
				contador++;
			}
		}
		return contador;
	}

	public static double media(double[] numeros) {
		double suma = 0, media = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return media = suma / numeros.length;
	}

}
