package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej09 {

	static Scanner s = new Scanner(System.in);
	static int numero = 30;
	static double[] notas = new double[numero];

	public static void media() {
		double notaMedia = 0;
		int contador = 0;
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > 0) {
				suma = suma + notas[i];
				contador++;
			}
			notaMedia = suma / contador;
		}
		System.out.printf("La nota media es: %.2f", notaMedia);
	}

	public static void maximo() {
		double maximo = notas[0];
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > maximo) {
				maximo = notas[i];
			}
		}
		System.out.println("La nota máxima es: " + maximo);
	}

	public static void aprobados() {
		int aprobados = 0, suspensos = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 0) {
			}
			if (notas[i] > 0 && notas[i] < 5) {
				suspensos++;
			}
			if (notas[i] >= 5) {
				aprobados++;
			}
		}
		System.out.println("El número de aprobados es " + aprobados);
		System.out.println("El número de suspensos es " + suspensos);
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
		aprobados();
		media();
		System.out.println();
		maximo();
	}
}
