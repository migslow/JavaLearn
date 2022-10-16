package ejerciciosBuclesForYDoWhile;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		double factorial = 1;
		do {
			System.out.println("Introduce un numero positivo (>0): ");
			n = s.nextInt();
		} while (n < 0);
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}
			System.out.println(factorial);
		}
	}
}
