package ejercicio01;

import java.util.Scanner;

public class ej03 {

	static Scanner s = new Scanner(System.in);
	static double d;

	public static double conversor(double d) {
		return d * 1.01;
	}

	public static void main(String[] args) {
		System.out.println("Introduce la cantidad de euros a conversar: ");
		d = s.nextDouble();
		System.out.println("La cantidad de euros a dolar es: " + conversor(d));
	}

}
