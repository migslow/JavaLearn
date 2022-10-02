package ejercicios1;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n1 = s.nextInt();
		int cuadrado = (int) Math.pow(n1, 2);
		System.out.println("El cuadrado de " + n1 + " es " + cuadrado);

	}

}
