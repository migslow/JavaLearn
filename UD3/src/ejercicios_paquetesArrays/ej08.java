package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej08 {

	static Scanner s = new Scanner(System.in);
	static double numero = 10;
	static double[] notas = new double[numero];

	public static void notas() {
		System.out.println("Introduce 10 notas: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce el " + i + ": ");
			notas[i] = s.nextInt();
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
	}

	public static int aprobados(int a) {

	}

	public static int suspendidos(int s) {

	}

	public static void main(String[] args) {
		notas();
	}

}
