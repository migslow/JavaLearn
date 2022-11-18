package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
 * Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos como parámetro para que nos indique si es o no un número primo, 
 * debe devolver true si es primo sino false. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
 * 17 si es primo.
 */

public class ej02 {

	static Scanner s = new Scanner(System.in);

	public static boolean esPrimo(int n) {
		for (int i = (int) Math.sqrt(n); i > 1; i--) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Introduce un numero entero por teclado: ");
		int n = s.nextInt();
		if (esPrimo(n)) {
			System.out.println("El numero es " + n + " primo");
		} else {
			System.out.println("El numero no es " + n + " primo");
		}
	}

}
