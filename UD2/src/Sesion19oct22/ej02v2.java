package Sesion19oct22;

import java.util.Scanner;

public class ej02v2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		int suma = 1;
		int serie;
		do {
			System.out.println("Introduce un numero entero por teclado: ");
			serie = s.nextInt();
			for (int i = 0; i < serie; i++) {
				suma = num1 + num2;
				num1 = num2;
				num2 = suma;
				System.out.print(suma + " - ");
			}
		} while (serie >= 1);
	}
}
