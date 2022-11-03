package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej06 {

	static Scanner s = new Scanner(System.in);
	static int[] num = new int[10];

	public static void leer() {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
	}

	public static int maximo(int[] num) {
		int maximo = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > maximo) {
				maximo = num[i];
			}
		}
		return maximo;
	}

	public static int minimo(int[] num) {
		int minimo = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > minimo) {
				minimo = num[i];
			}
		}
		return minimo;
	}

	public static void main(String[] args) {
		System.out.println("Introduce 10 numeros enteros por teclado: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print("Introduce el " + i + ": ");
			num[i] = s.nextInt();
		}
		leer();
		maximo(num);
		minimo(num);
		if (num[0] == maximo(num)) {
			System.out.println(" maximo");
		}
		if (num[0] == minimo(num)) {
			System.out.println(" minimo");
		}
	}
}
