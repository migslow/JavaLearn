package ejerciciosBuclesForYDoWhile;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0, suma = 0, n, max = 0, min = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce 10 numeros por teclado: ");
			n = s.nextInt();
			contador++;
			if (n < 0) {
				min++;
			} else {
				max++;
			}
			suma = suma + n;
		}
		System.out.println("La suma de los numeros son: " + suma);
		System.out.println("Hay " + max + " numeros positivos");
		System.out.println("Hay " + min + " numeros negativos");
	}

}
