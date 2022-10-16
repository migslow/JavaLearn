package ejerciciosBuclesForYDoWhile;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int suma = 0;
		int n;
		int factorial = 0;
		do {
			System.out.println("Introduce un numero positivo ( >0 ): ");
			n = s.nextInt();
		} while (n < 0);
		for (int i = 0; i <= n; i++) {
			factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}
		}
		suma = suma + factorial;
		System.out.println("El resultado del factorial es: " + factorial);
		System.out.println("La suma del factorial es: " + suma);
	}

}
