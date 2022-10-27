package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
 * Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo realizara mediante un método al que le pasamos el número como parámetro. 
 * Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno. 
 * Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.
 */

public class ej03 {
	
	static Scanner s = new Scanner(System.in);
	
	public static int factorial(int n) {
		int factorial = 1;
		System.out.println("Introduce un numero entero por teclado: ");
		n = s.nextInt();
		for(int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println("El factorial es " + factorial(0));

	}

}
