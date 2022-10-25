package ejercicio01;

import java.util.Scanner;

public class ej06 {

	static Scanner s = new Scanner(System.in);
	static int calculo;

	public static int cuadrado(int n) {
		System.out.println("Introduce el primer numero entero: ");
		n = s.nextInt();
		calculo = (int) Math.pow(n, 0.5);
		return calculo;
	}

	public static void main(String[] args) {
		System.out.println(cuadrado(0) + " es cuadrado de " + n);
	}

}
