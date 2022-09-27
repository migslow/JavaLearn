package ejercicios1;

import java.util.Scanner;

public class ej18Numeros {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introoduce n numeros enteros: ");
		int n = s.nextInt();
		int pares = 0, impares = 0;

		while (n == 0) {
			System.out.println("Introduce otro numero entero: ");
			n = s.nextInt();
			if (n == 0) {
				if (n % 2 == 0) {
					pares = pares + 1;
				} else {
					impares = impares + 1;
				}
				System.out.println("Numeros pares: " + pares);
				System.out.println("Numeros pares: " + impares);
			}

		}

	}

}
