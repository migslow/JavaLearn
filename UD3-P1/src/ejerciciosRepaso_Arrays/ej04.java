package ejerciciosRepaso_Arrays;

import java.util.Scanner;

public class ej04 {

	static Scanner s = new Scanner(System.in);

	public static double media(double[] alturas) {
		double suma = 0;
		for (int i = 0; i < alturas.length; i++) {
			suma = suma + alturas[i];
		}
		return suma / alturas.length;
	}

	public static int alturaSuperior(double [] alturas, double media) {
		int suma = 0;
		for (int i = 0; i < alturas.length; i++) {
			if(alturas[i] > media) {
				suma++;
			}
		}
		return suma;
	}

	public static int alturaInferior(double [] alturas, double media) {
		int suma = 0;
		for (int i = 0; i < alturas.length; i++) {
			if(alturas[i] < media) {
				suma++;
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		System.out.println("Introduce el numero de personas que va ha formar el array: ");
		int personas = s.nextInt();
		double[] alturas = new double[personas];
		if (personas > 0) {
			System.out.println("Introduce las alturas: ");
			for (int i = 0; i < alturas.length; i++) {
				System.out.print("Elemento " + i + ": ");
				alturas[i] = s.nextInt();
			}
			System.out.println("\nEl array tiene las siguientes alturas: ");
			for (double p : alturas) {
				System.out.println(p);
			}
		} else {
			System.out.println("Has introducido un numero negativo. Fin");
			System.exit(0);
		}
		double media = media(alturas);

		System.out.println("\nLa media de las alturas es: " + media(alturas));
		System.out.println("El numero de personas con una altura superior es: " + alturaSuperior(alturas, media));
		System.out.println("El numero de personas con una altura inferior es: " + alturaInferior(alturas, media));
	}
}
