package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej09 {

	static Scanner s = new Scanner(System.in);
	static int numero = 10;
	static double[] notas = new double[numero];

	public static void notas() {
		System.out.println("Introduce 30 notas: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce el " + i + ": ");
			notas[i] = s.nextInt();
			if (notas[i] < 0) {
				System.out.println("Has introducido una nota negativa. Fin");
				System.exit(0);
			}

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

	 public static double maximo(int m) {
		 double maximo = notas[0];
			for (int i = 0; i < notas.length; i++) {
				if (notas[i] > maximo) {
					maximo = notas[i];
				}
			}
			return maximo;
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
		System.out.println("El maximo es: " + maximo(numero));
	}

}
