package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej08 {

	static Scanner s = new Scanner(System.in);
	static int numero = 10;
	static double[] notas = new double[numero];

	public static void notas() {
		System.out.println("Introduce 10 notas: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce el " + i + ": ");
			notas[i] = s.nextInt();
		}
		System.out.println("\nLas notas introducidas son: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}

	public static double media(double m) {
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}
		return suma / notas.length;
	}

	public static int aprobados(int a) {
		int contador = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				contador++;
			}
		}
		return contador;
	}

	public static int suspendidos(int s) {
		int contador = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		notas();
		System.out.println("\nEl numero de aprobados es: " + aprobados(numero));
		System.out.println("El numero de suspendidos es: " + suspendidos(numero));
		System.out.println("La nota media es: " + media(numero));
	}

}
