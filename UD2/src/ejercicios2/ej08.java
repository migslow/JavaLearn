package ejercicios2;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero mayor que 1: ");
		int n;
		do {
			n = s.nextInt();
			if (n <= 1) {
				System.out.println("Error, introduce un numero mayor que 1");
				System.exit(0);
			}
		} while (!(n >= 1));
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			suma = suma + n;
		}
		System.out.println("La suma es " + suma);
	}

}
