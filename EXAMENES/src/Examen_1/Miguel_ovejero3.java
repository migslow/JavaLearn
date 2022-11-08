package Examen_1;

import java.util.Scanner;

public class Miguel_ovejero3 {

	public static void main(String[] args) {
		int contador = 0;
		int minimo = 20;
		for (int i = 1; i <= 15; i++) {

			int rdm = (int) (Math.random() * 21);
			System.out.print(rdm + " ");
			if (i == 1) {
				minimo = rdm;
			}
			if (rdm < minimo) {
				minimo = rdm;
			}
			if (minimo == rdm) {
				contador++;
			}
		}
		System.out.println("\n" + minimo);
		System.out.println("El numero " + minimo + " se cuenta " + contador + " veces");

	}
}
