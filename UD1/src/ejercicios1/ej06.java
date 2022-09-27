package ejercicios1;

import java.util.Scanner;

public class ej06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euros;
		double dollar = 1.1774;
		System.out.println("Introduce la cantidad de euros a conversar: ");
		euros = s.nextDouble();
		double calculo = euros * dollar;
		System.out.println("El cambio es de: " + calculo + "€");
	}

}
