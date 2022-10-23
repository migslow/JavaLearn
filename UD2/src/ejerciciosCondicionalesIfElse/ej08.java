package ejerciciosCondicionalesIfElse;

import java.util.Scanner;

// Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €,el segundo 20 €, el tercero 40 € y así sucesivamente.
// Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después de los 20 meses.

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int suma = 0;
		int cantidad = 10;
		for (int i = 1; i <= 20; i++) {
			System.out.println("En el mes " + i + " pagara: " + cantidad);
			suma = suma + cantidad;
			cantidad = cantidad * 2;
		}
		System.out.println("Total a pagar: " + suma);
	}
}
