package ejercicio01;

import java.util.Scanner;

public class ej05 {
	
	static Scanner s = new Scanner(System.in);
	
	public static int potencias(int p1, int p2) {
		System.out.println("Introduce el primer numero entero: ");
		p1 = s.nextInt();
		System.out.println("Introduce el segundo numero entero: ");
		p2 = s.nextInt();
		return (int) Math.pow( (double)p1, (double)p2);
	}

	public static void main(String[] args) {
		System.out.println("El calculo de: " + potencias);

	}

}
