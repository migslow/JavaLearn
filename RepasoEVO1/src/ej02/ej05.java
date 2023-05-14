package ej02;

import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un numero: ");
		int n = s.nextInt();
		int suma = 0, contador = 0, max = 0, min = 100;

		if (n < 0) {
			System.exit(0);
		}
		while (n >= 0) {
			suma = suma + n;
			contador++;
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
			n = s.nextInt();
		}
		System.out.println("La media vale " + (double) suma / contador);
		System.out.println("El mínimo es " + min);
		System.out.println("El máximo es  " + max);

	}

}
