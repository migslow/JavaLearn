package ej01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionesBasicas {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el primer numero: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = s.nextInt();

		System.out.println("-------Menu-------");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("Introduce un numero entre 1 y 4: ");
		int numeroMenu = s.nextInt();

		switch (numeroMenu) {
		case 1:
			suma(n1, n2);
			break;
		case 2:
			resta(n1, n2);
			break;
		case 3:
			multiplicacion(n1, n2);
			break;
		case 4:
			division(n1, n2);
			break;
		default:
			System.out.println("No has introduce un numero entre 1 y 4");
		}
	}

	public static int suma(int n1, int n2) {
		int resultado = 0;
		try {
			resultado = n1 + n2;
			System.out.println("La suma es " + resultado);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		return resultado;
	}

	public static int resta(int n1, int n2) {
		int resultado = 0;
		try {
			resultado = n1 - n2;
			System.out.println("La resta es " + resultado);
		} catch (InputMismatchException ime) {
			System.out.println("Has introducido una letra");
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		return resultado;
	}

	public static int multiplicacion(int n1, int n2) {
		int resultado = 0;
		try {
			resultado = n1 * n2;
			System.out.println("La multiplicacion es " + resultado);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		return resultado;
	}

	public static int division(int n1, int n2) {
		int resultado = 0;
		try {
			resultado = n1 / n2;
			System.out.println("La division es " + resultado);
		} catch (Exception e) {
			System.out.println("No puedes dividir por 0");
		}
		return resultado;
	}

}
