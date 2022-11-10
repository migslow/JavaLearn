package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej09 {

	static Scanner s = new Scanner(System.in);
	static int numero = 30;
	static double[] notas = new double[numero];

	public static double media(double m) {
		int contador = 0;
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
			contador++;
		}
		return contador / suma;
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
		System.out.println("Introduce 30 notas hasta que introduzcas un numero negativo: ");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 0) {
				System.out.print("Introduzca nota " + i + ": ");
				notas[i] = s.nextDouble();
			}
			if (notas[i] < 0)
				break;
		}
		System.out.println("\nEl numero de aprobados es: " + aprobados(numero));
		System.out.println("El numero de suspendidos es: " + suspendidos(numero));
		System.out.println("La nota media es: " + media(numero));
		System.out.println("El maximo es: " + maximo(numero));
	}
}
