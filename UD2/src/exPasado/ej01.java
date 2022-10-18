package exPasado;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();
		int suma = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				suma = suma + i;
			}
		}// del for

		if (suma == n) {
			System.out.println("El numero es perfecto");
		} else {
			System.out.println("El numero no es perfecto");
		}
	}// del main
}
