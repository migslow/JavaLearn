package ejerciciosWeb_paqueteMetodos;

/*
 * Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dolares, yenes o libras. 
 * El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor, mostrara un mensaje indicando el cambio (void).
El cambio de divisas son:

0.86 libras es un 1 €
1.28611 $ es un 1 €
129.852 yenes es un 1 €
 */

import java.util.Scanner;

public class ej04 {

	static Scanner s = new Scanner(System.in);

	public static double conversor(double m, String n) {
		double calculo;
		System.out.println("========MENU==========");
		System.out.println("1. Conversor a Libras");
		System.out.println("2. Conversor a Dolares");
		System.out.println("3. Conversor a Yenes");
		System.out.println("Introduce el nombre de la moneda: ");
		String nombre = s.next();
		System.out.println("Introduce el numero de euros: ");
		int numero = s.nextInt();
		switch (nombre) {
		case "libras":
			calculo = numero * 0.86;
			System.out.println("El cambio de libras a euros es: " + calculo);
			break;
		case "dolares":
			calculo = numero * 1.28611;
			System.out.println("El cambio de dolares a euros es: " + calculo);
			break;
		case "yenes":
			calculo = numero * 129.852;
			System.out.println("El cambio de yenes a euros es: " + calculo);
			break;
		default:
			System.out.println("No has introducido bien el nombre de la moneda");
			break;

		}
		return numero;
	}

	public static void main(String[] args) {
		System.out.print(conversor(0, null));

	}

}
