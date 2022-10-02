package ejercicios1;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int num1 = s.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("El numero: " + num1 + " es par");
		} else {
			System.out.println("El numero: " + num1 + " es impar");
		}

	}

}
