package Sesion19oct22;

import java.util.Scanner;

public class ej02v3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero por teclado: ");
		int serie = s.nextInt();

		int num1 = 0;
		int num2 = 1;
		int suma = 1;

		while(serie > 1) {
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
			System.out.print(suma + " - ");
		}

	}

}
