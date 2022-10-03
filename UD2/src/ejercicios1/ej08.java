package ejercicios1;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int filas = s.nextInt();
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

}
