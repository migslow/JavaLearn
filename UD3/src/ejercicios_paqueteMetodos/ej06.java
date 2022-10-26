package ejercicios_paqueteMetodos;

import java.util.Scanner;

public class ej06 {

	static Scanner s = new Scanner(System.in);
	static double calculo;

	public static double cuadrado(double n) {
		System.out.println("Introduce un numero entero: ");
		n = s.nextInt();
		calculo = Math.sqrt(n);
		if (n % calculo == 0) {
			System.out.println(calculo + " es cuadrado de " + n);
			return calculo;
		} else {
			System.out.println(0);
			return 0;
		}
	}

	public static void main(String[] args) {
		cuadrado(calculo);
	}
}
