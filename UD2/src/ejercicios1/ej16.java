package ejercicios1;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long acumulador = 0, y;
		System.out.print("Introduce un n�mero entero positivo: ");
		long x = s.nextInt();
		while (x > 0) {
			y = x % 10;
			acumulador = acumulador + y;
			x = x / 10;
		}
		System.out.print("La suma de todos sus d�gitos es: " + acumulador);
	}
}
