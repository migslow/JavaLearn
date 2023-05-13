package ej03;

import java.util.Scanner;

public class ej37 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el numero de personas: ");
		int p = s.nextInt();
		double[] alturas = new double[p];
		rellenarArray(alturas);
		System.out.println("\nLa media es: " + media(alturas));
		double media = media(alturas);
		System.out.println("\nEl numero de personas con una altura superior a la media: " + alturaSuperirMedia(alturas, media));
		System.out.println("\nEl numero de personas con una altura inferior a la media: " + alturaInferiorMedia(alturas, media));
	}

	public static void rellenarArray(double[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce la altura en la posicion [" + i + "]: ");
			v[i] = s.nextDouble();
		}

		for (int i = 0; i < v.length; i++) {
			System.out.println("Altura: " + v[i]);
		}
	}

	public static double media(double[] v) {
		double suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i];
		}
		return suma / v.length;
	}

	public static int alturaSuperirMedia(double[] v, double media) {
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= media) {
				contador++;
			}
		}
		return contador;
	}

	public static int alturaInferiorMedia(double[] v, double media) {
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < media) {
				contador++;
			}
		}
		return contador;
	}

}
