package ejercicios;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double grados, calculo;
		System.out.println("Introduce la temperatura que hace en grados: ");
		grados = s.nextDouble();
		calculo = ((5.0 / 9) * (grados - 32));
		System.out.println(calculo + " grados");
	}

}
