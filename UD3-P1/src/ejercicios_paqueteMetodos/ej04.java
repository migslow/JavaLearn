package ejercicios_paqueteMetodos;

import java.util.Scanner;

public class ej04 {

	static Scanner s = new Scanner(System.in);

	public static double calculo(double c) {
		double pi = 3.14;
		System.out.println("Introduce el radio del circulo: ");
		int radio = s.nextInt();
		return pi * radio / 2;
	}

	public static void main(String[] args) {
		System.out.println("El area del cirulo es: " + calculo(0));
	}

}
