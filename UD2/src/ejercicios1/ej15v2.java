package ejercicios1;

import java.util.Scanner;

public class ej15v2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			int contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				System.out.println(i);
			}
		}
	}
}
