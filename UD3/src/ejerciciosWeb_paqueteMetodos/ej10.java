package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
 * En este ejercicio se debe mostrar el mensaje «Ha ingresado un numero de un dígito», si el numero ingresado esta en el rango del 1 al 9, si ingresa un numero de 2 dígitos mostrar el mensaje; 
 * «Ha ingresado un numero de dos dígitos», de la misma manera si es de 3 dígitos.
 */

public class ej10 {

	static Scanner s = new Scanner(System.in);

	public static int digitos(int n) {
		System.out.println("Introduce un numero entero: ");
		int numero = s.nextInt();
		while (numero <= 0) {
			if (numero >= 1 && numero <= 9) {
				System.out.println("El numero introducido consta de un 1 digito");
			} else if (numero > 10 && numero <= 100) {
				System.out.println("El numero introducido consta de 2 digitos");
			} else if (numero > 101){
				System.out.println("El numero introducido consta de 3 digitos");
			} else {
				System.out.println("No has introducido un numero valido");
			}
			numero = s.nextInt();
		}
		return numero;
	}

	public static void main(String[] args) {
		digitos(0);

	}

}
