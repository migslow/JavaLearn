package ejercicios1;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n1 = s.nextInt();
		double x = Math.sqrt(n1);
		if (n1 % x == 0)
			System.out.println(n1 + " es el cuadrado de " + x);
		else {
			System.out.println("No se puede");
		}

	}

}
