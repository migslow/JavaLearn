package Examen_1;

import java.util.Scanner;

public class Miguel_ovejero3 {

	public static void main(String[] args) {
		int contador = 0;
		int minimo = 100;
		for (int i = 0; i <= 15; i++) {

			int rdm = (int) (Math.random() * 21);
			System.out.print(rdm + " ");
			if (rdm < minimo) {
                minimo = rdm;
                contador = 1;
            } else if (rdm == minimo) {
                contador++;
            }
		}
		System.out.println("\n" + minimo);
		System.out.println("El numero " + minimo + " se cuenta " + contador + " veces");

	}
}
