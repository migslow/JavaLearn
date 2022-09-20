package ejercicios;

import java.util.Scanner;

public class ej07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euros = 1;
		double dollar;
		System.out.println("Introduce la cantidad de dollares a conversar: ");
		dollar = s.nextDouble();
		
		double calculo = euros * dollar;
		System.out.println("El cambio es de: " + calculo + "$");
	}

}
