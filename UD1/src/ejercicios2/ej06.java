package ejercicios2;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numVentas = 0;
		System.out.println("Introduce el numero de ventas por teclado: ");
		numVentas = s.nextInt();

		for (int i = 0; i < numVentas; i++) {
			System.out.println("Introduce la suma de las ventas: " + (i + 1));
			int venta = s.nextInt();
			numVentas = numVentas + venta;
		}
		System.out.println(numVentas);

	}

}
