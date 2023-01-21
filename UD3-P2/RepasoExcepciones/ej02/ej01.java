package ej02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Introduce un numero entero: ");
			int n1 = s.nextInt();
			int n2 = 15;

			double n3 = n1 + n2;
			System.out.println(n3);
		} catch (InputMismatchException ime) {
			System.out.println("No has introducido un numero entero");
		}

	}

}
