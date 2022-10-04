package ejercicios2;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre del cliente: ");
		String nombre = s.next();
		System.out.println("Introduce la cantidad de productos que ha comprado: ");
		int cantidad = s.nextInt();
		if (cantidad < 5) {
			System.out.println("Pagaré con Efectivo");
		} else if (cantidad >= 5 && cantidad <= 12) {
			System.out.println("Pagaré con Tarjeta");
		} else {
			System.out.println("Pagaré con Cheque");
		}

	}

}
