package ejercicios1;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce los metros cubicos de agua consumidos: ");
		double metrosCubicos = s.nextDouble();

		final double A = (100 * 0.15);
		final double B = (400 * 0.20);
		final double C = (500 * 0.35);

		if (metrosCubicos <= 100) {
			System.out.println("El coste total es: " + (metrosCubicos * 0.15));
		}
		if (metrosCubicos > 100 && metrosCubicos <= 500) {
			System.out.println("El coste total es: " + (A + ((metrosCubicos - 100) * 0.20)));
		}
		if (metrosCubicos > 500 && metrosCubicos <= 1000) {
			System.out.println("El coste total es: " + (A + B + ((metrosCubicos - 500) * 0.35)));
		}
		if (metrosCubicos > 1000) {
			System.out.println("El coste total es: " + (A + B + C + ((metrosCubicos - 1000) * 0.80)));
		}
	}

}
