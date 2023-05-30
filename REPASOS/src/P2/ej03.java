package P2;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		int n1 = s.nextInt();
		double x = Math.sqrt(n1);
		if (n1 % x == 0)
			System.out.println(n1 + " es el cuadrado de " + x);
		else {
			System.out.println("No se puede");
		}

	}

}
