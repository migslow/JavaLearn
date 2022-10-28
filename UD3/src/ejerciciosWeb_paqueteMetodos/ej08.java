package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
 * Diseñe un método que al ingresar por teclado un numero, si es par mostrar el doble, si es impar mostrar el triple.
 */

public class ej08 {
	
	static Scanner s = new Scanner(System.in);
	
	public static int esPar(int p) {
		System.out.println("Introduce un numero entero por teclado: ");
		int n = s.nextInt();
		if(n  % 2 == 0) {
			System.out.println("El numero " + n*2 + " es par");
		} else {
			System.out.println("El numero " + n*3 + " es impar");
		}
		return n;
	}
	public static void main(String[] args) {
		esPar(0);

	}

}
