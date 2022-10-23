package ejerciciosBuclesForYDoWhile;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2;
		do {
			System.out.println("Introduce el primer numero entero: ");
			n1 = s.nextInt();
			System.out.println("Introduce el segundo numero entero: ");
			n2 = s.nextInt();
		} while (n1 != n2);
		System.out.println("Los dos numeros son iguales");
	}

}
