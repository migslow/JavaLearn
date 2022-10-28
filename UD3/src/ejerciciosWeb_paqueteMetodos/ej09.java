package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
 *  Crea un método que al ingresar por teclado un número cualquiera, muestre la cantidad de  números pares a partir del 2, por ejemplo: si se  introduce 7, 
 *  entonces se imprimirá, 2, 4, 6, 8, 10, 12,14 o si se introduce 10 = 2, 4, 6, 8, 10, 12, 14, 16, 18, 20. No se como
 */

public class ej09 {

	static Scanner s = new Scanner(System.in);

	public static int esPar(int p) {
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " - ");
		} else {
			n++;
		}
		return n;
	}

	public static void main(String[] args) {
		esPar(0);
	}

}
