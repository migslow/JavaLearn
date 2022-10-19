package Sesion19oct22;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero por teclado: ");
		int serie = s.nextInt();

		int num1 = 0;
		int num2 = 1;
		int suma = 1;

		for (int i = 1; i < serie; i++) {
			System.out.print(suma + " - ");
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}

	}

}
