package ejercicios1;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();
		double factorial = 1;
		for(int i = n; i > 0; i--) {
			factorial = factorial * i;
			System.out.println(i);
		}
		System.out.println("El factorial de " + n + " es: " + factorial);
	}

}
