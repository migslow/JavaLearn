package ej03;

import java.util.Scanner;

public class ej11 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		double[] notas = new double[5];
		escrituraNotas(notas);
		System.out.println("\nNumero de aprobados: " + aprobados(notas));
		System.out.println("\nNumero de suspensos: " + suspendos(notas));
		System.out.println("\nLa media es: " + media(notas));
		System.out.println("\nEl numero maximo es: " + maximaNota(notas));
	}

	public static void escrituraNotas(double[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 0) {
				System.out.println("Introduce la nota en la posicion: [" + i + "]");
				numeros[i] = s.nextInt();
			}
			if (numeros[i] < 0) {
				break;
			}
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

	public static int suspendos(double[] numeros) {
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

	public static int maximaNota(double[] numeros) {
		int maximo = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = (int) numeros[i];
			}
		}
		return maximo;
	}

}
