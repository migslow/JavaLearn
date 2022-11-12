package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		double notas[][] = { { 5.6, 9.4, 6.8, 7 }, { 6.9, 5.2, 5.7, 6.3 }, { 9.8, 8, 7.6, 8.5 } };
		MaxMinMediaAlumno(notas);
		System.out.println("==========================================");
		MaxMinMediaAsignatura(notas);
		System.out.println("==========================================");
		MaxMinMediaTodoCurso(notas);
	}

	public static void MaxMinMediaAlumno(double notas[][]) {
		double media = 0, maximo, minimo;
		for (int i = 0; i < notas.length; i++) {
			maximo = notas[i][0];
			minimo = notas[i][0];
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] > maximo)
					maximo = notas[i][j];
				if (notas[i][j] < minimo)
					minimo = notas[i][j];
				media = media + notas[i][j];
			}
			System.out.println("\nAlumno " + (i + 1) + ": ");
			System.out.print("nNota maxima: " + maximo + " ");
			System.out.print("\nNota minima: " + minimo + " ");
			System.out.println("\nNota media: " + media / notas.length);
		}
	}

	public static void MaxMinMediaAsignatura(double notas[][]) {
		double media = 0, maximo, minimo;
		for (int j = 0; j < notas[0].length; j++) {
			maximo = notas[0][j];
			minimo = notas[0][j];
			for (int i = 0; i < notas.length; i++) {
				if (notas[i][j] > maximo)
					maximo = notas[i][j];
				if (notas[i][j] < minimo)
					minimo = notas[i][j];
				media = media + notas[i][j];
			}
			System.out.println("|nAsignatura " + (j + 1) + ": ");
			System.out.print("\nNota maxima: " + maximo + " ");
			System.out.print("\nNota minima: " + minimo + " ");
			System.out.println("\nNota media: " + media / notas.length);
		}

	}

	public static void MaxMinMediaTodoCurso(double notas[][]) {
		double media = 0;
		double maximo = notas[0][0];
		double minimo = notas[0][0];
		int contador = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] > maximo)
					maximo = notas[i][j];
				if (notas[i][j] < minimo)
					minimo = notas[i][j];
				media = media + notas[i][j];
				contador++;
			}
		}
		System.out.print("\nCurso maxima: " + maximo + " ");
		System.out.print("\nCurso minima: " + minimo + " ");
		System.out.println("\nCurso media: " + media / contador);
	}
	
	public static void buscarNota(double notas[][]) {
		Scanner s = new Scanner(System.in);
		double nota = notas[0][0];
		System.out.println("Introduce la nota que quieres buscar por teclado: ");
		nota = s.nextDouble();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if(nota = notas[][]) {
					
				}
			}
	}

}
