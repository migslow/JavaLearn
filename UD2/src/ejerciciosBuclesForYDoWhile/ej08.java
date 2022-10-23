package ejerciciosBuclesForYDoWhile;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0;
		int suma = 0;
		int n;

		do {
			System.out.println("Introduce 10 numeros por teclado: ");
			n = s.nextInt();
			contador++;
			suma = suma + n;
		} while (contador < 10);
		System.out.println("La suma de los 10 numeros son: " + suma);
	}

}
