package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);
	static int numero;

	public static void multi(int n) {
		int calculo = 0;
		System.out.println("La tabla del " + numero);
		for (int i = 1; i <= 10; i++) {
			if (numero >= 1 && numero <= 10) {
				calculo = i * numero;
				System.out.println(i + " x " + numero + " = " + calculo);
			} else {
				System.out.println("No has introducido un numero entre 1 y 10");
				System.out.println("Fin");
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce un numero entre 1 y 10: ");
		numero = s.nextInt();
		//
		multi(0);
	}
}
