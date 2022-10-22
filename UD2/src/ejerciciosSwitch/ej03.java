package ejerciciosSwitch;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int mes, anyo;
		System.out.println("Introduce el numero del mes: (1-12): ");
		mes = s.nextInt();
		System.out.println("Introduce el año: ");
		anyo = s.nextInt();
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 dias");
			break;
		case 2:
			System.out.println("El mes tiene 29 o 28 dias");
			break;
		default:
			System.out.println("No es un numero comprendido entre 1 y 12");

		}

	}

}
