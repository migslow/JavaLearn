package ejerciciosSwitch;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcion, n;
		System.out.println("Menu");
		System.out.println("1. Cubo de un numero");
		System.out.println("2. Numero par o impar");
		System.out.println("3. Salir");
		System.out.print("Introduce un numero entre 1-3: ");
		opcion = s.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Intoduce un numero: ");
			n = s.nextInt();
			int cubo = (int) (Math.pow(n, 3));
			break;
		case 2:
			System.out.print("Ingresar numero: ");
			n = s.nextInt();
			if (n % 2 == 0)
				System.out.println("El numero es par");
			else
				System.out.println("El numero es impar");
			break;
		case 3:
			break;
		default:
			System.out.println("No has introducido un numero entre 1 y 3");
		}
	}
}
