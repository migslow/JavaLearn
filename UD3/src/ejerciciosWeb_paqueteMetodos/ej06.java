package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
 * Elabore un método que simule el proceso de subir a un piso en un ascensor, donde el numero de piso es ingresado por teclado.
 */

public class ej06 {

	static Scanner s = new Scanner(System.in);
	static int p;

	public static int subir(int planta) {
		System.out.println("Introduce la planta a la que quiere subir: ");
		p = s.nextInt();
		for (int i = 1; i <= p; i++) {
			System.out.println("Subiendo al piso " + i);
		}
		return planta;
		
	}

	public static void main(String[] args) {
		subir(0);

	}

}
