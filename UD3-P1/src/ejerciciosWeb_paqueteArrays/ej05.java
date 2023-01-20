package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la dimension del array: ");
		int n = s.nextInt();
		double[] alturas = new double[n];

		// metodos
		escribirArray(alturas);
		leerArray(alturas);
		mediaSuperior(alturas);

	}

	public static void escribirArray(double[] n) {
		System.out.println("Introduce las alturas: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print("Introduce el elemento " + i + ": ");
			n[i] = s.nextDouble();
		}
	}

	public static void leerArray(double[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	public static void mediaSuperior(double[] n) {
		int contadorSuperior = 0, contadorInferior = 0;
		double suma = 0, media = 0;
		for (int i = 0; i < n.length; i++) {
			suma = suma + n[i];
		}
		media = suma / n.length;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > media) {
				contadorSuperior++;
			}
			if (n[i] < media) {
				contadorInferior++;
			}
		}
		System.out.println("La media de todas la alturas es: " + media);
		System.out.println("El numero de personas con una altura superior es: " + contadorSuperior);
		System.out.println("El numero de personas con una altura inferior es: " + contadorInferior);
	}

}
