package ejercicios2;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduce el primer n�mero: ");
		num1 = s.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		num2 = s.nextInt();

		if (num1 > num2) {
			System.out.println("El primer n�mero es mayor que el " + num2);
		} else if (num1 < num2) {
			System.out.println("El segundo n�mero es mayor que el " + num1);
		} else {
			System.out.println("Los dos n�meros son iguales");
		}

	}

}
