package ejercicios1;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double pi = 3.1416;
		System.out.println("Introduce el radio del circulo: ");
		int radio = s.nextInt();
		double calculo = pi * Math.pow(radio, 2);
		System.out.println("El área del circulo es: " + calculo);

	}

}
