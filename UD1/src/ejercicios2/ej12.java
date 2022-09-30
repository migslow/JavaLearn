package ejercicios2;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero entero: ");
		numero = s.nextInt();
		for (int i = 0; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

	}

}
