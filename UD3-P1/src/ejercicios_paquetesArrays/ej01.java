package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numeros[] = new int[10];
		System.out.println("Introduce 10 numeros por teclado: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce el " + i + ": ");
			numeros[i] = s.nextInt();
		}

		for (int i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

	}

}
