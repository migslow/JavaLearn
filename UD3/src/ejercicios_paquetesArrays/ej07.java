package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej07 {

	static Scanner s = new Scanner(System.in);
	static int m = 15;
	static int[] num = new int[m];

	public static void pedir() {
		System.out.println("Introduce 10 numeros por teclado: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print("Introduce el " + i + ": ");
			num[i] = s.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public static void rotar() {
		int ultimo = num[14];
		for (int i = 13; i >= 0; i--) {
			num[i + 1] = num[i];
		}
		num[0] = ultimo;
		System.out.print("\nEl array se veria de esta manera: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public static void main(String[] args) {
		pedir();
		rotar();
	}

}
