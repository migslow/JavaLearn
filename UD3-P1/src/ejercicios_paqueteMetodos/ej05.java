package ejercicios_paqueteMetodos;

import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);

	public static int potencias(int n1, int n2) {
		System.out.println("Introduce el primer numero entero: ");
		n1 = s.nextInt();
		System.out.println("Introduce el segundo numero entero: ");
		n2 = s.nextInt();
		int resultado = 0;
		for (int i = 1; i < n1; i++) {
			resultado = n1 * n2;
		}
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println("El calculo de la potencia es: " + potencias(4, 5));

	}

}
