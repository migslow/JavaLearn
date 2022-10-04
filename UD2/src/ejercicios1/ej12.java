package ejercicios1;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero de tipo real: ");
		double a = s.nextDouble();
		System.out.println("Introduce un numero entero: ");
		int b = s.nextInt();
		double acumulador = a;
		for (int i = 1; i < b; i++) {
			acumulador = acumulador * a;
		}
		System.out.print(a + " elevado a " + b + " es = " + acumulador);

	}

}
