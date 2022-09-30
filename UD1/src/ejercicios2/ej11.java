package ejercicios2;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int radio;
		double area;
		System.out.println("Introduce el radio del circulo: ");
		radio = s.nextInt();
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area del círculo es: " + area);
	}

}
