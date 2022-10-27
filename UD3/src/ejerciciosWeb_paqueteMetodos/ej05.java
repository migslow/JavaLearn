package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);

	public static void multi(int n) {
		int calculo = 0;
		System.out.println("Introduce el numero: ");
		int numero = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			calculo = i * numero;
			System.out.println(i + " x " + numero + " = " + calculo);
		}
	}

	public static void main(String[] args) {
		multi(0);

	}

}
