package ejerciciosBuclesForYDoWhile;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0, suma = 0, n;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce los 10 numeros por teclado: ");
			n = s.nextInt();
			suma = suma + n;
			contador++;
		}
		System.out.println("La suma de los 10 numeros es: " + suma);

	}

}
