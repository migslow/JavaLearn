package ejercicios;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la cantidad de billetes a desglosar: ");
		int num1 = s.nextInt();
		System.out.println("Billetes de 500: " + (num1 / 500));
		System.out.println("Billetes de 200: " + (num1 % 500 / 200));
		System.out.println("Billetes de 100: " + (num1 % 500 % 200 / 100));
		System.out.println("Billetes de 50: " + (num1 % 500 % 200 % 100 / 50));
		System.out.println("Billetes de 20: " + (num1 % 500 % 200 % 100 % 50 / 20));
		System.out.println("Billetes de 10: " + (num1 % 500 % 200 % 100 % 50 % 20 / 10));
		System.out.println("Billetes de 5: " + (num1 % 500 % 200 % 100 % 50 % 20 % 10 / 5));
		System.out.println("Monedas de 1: " + (num1 % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 1));

	}

}
