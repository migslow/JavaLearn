package ExpresionesRegulares;

import java.util.Scanner;

/*
 * Validar un número de teléfono internacional (Comienza por paréntesis, le sigue el carácter +, después 2 ó
3 cifras numéricas, paréntesis de cierre y 9 cifras numéricas); ej--> (+34)974243447
 */

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero internacional: ");
		String telefono = s.nextLine();
		if (telefono.matches("\\(\\+[\\d]{2,3}\\)[\\d]{9}")) {
			System.out.println("El numero internacional es valido");
		} else {
			System.out.println("El numero internacional no es valido");
		}

	}

}
