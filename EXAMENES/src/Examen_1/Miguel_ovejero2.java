package Examen_1;

import java.util.Scanner;

public class Miguel_ovejero2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0, contador = 0;
		System.out.println("Introduce el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo  número: ");
		int num2 = sc.nextInt();

		if (num1 > num2 || num1 < 1 || num2 < 1) {
			System.out.println("Uno de los dos números o los dos es /son inferior (es)a 1");
			System.out.println("Fin del programa");
		} else {
			System.out.print("Multiplos de " + num1 + " entre 1 y " + num2 + " :");
			for (int i = num1; i <= num2; i += num1) {
				System.out.print(i + " ");
				suma = suma + i;
				contador++;
			}
			System.out.println("\nSuman " + suma);
			System.out.println("Cantidad de números " + contador);
		}

	}
}
