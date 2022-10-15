package ejerciciosCondicionalesIfElse;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre del cliente: ");
		String nombre = s.next();
		System.out.println("Introduce la cantidad de llantas: ");
		int cantidad = s.nextInt();
		int total;
		if (cantidad <= 12) {
			total = cantidad * 300;
			System.out.println("El total es: " + total);
		}
		if (cantidad > 12) {
			total = cantidad * 280;
			System.out.println("El total es: " + total);
		}

	}

}
