package ejercicios;

import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introducción de datos para el calculo");
		System.out.println("Cantidad prestada: ");
		int pres = s.nextInt();
		System.out.println("Interes anual (%): ");
		double anual = s.nextDouble();
		System.out.println("Duración en anyos del prestamo: ");
		int anyos = s.nextInt();

		int CalPagos = pres / (int) anual;

		System.out.println("=============================================");
		System.out.println("Resultado de la opetación: ");
		System.out.println("Cantidad prestada " + pres);
		System.out.println("Interes anual " + anual);
		System.out.println("Duración en anyos del prestamo " + anyos);
		System.out.println("Numero de pagos:  " + CalPagos);
	}

}
