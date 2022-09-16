package ejercicios;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double meses = 12, mes = 8;
		double porcentaje;

		porcentaje = mes * 100 / meses;

		System.out.println("Mes " + mes + " de " + meses);
		System.out.printf("Porcentaje transcurrido: %.4f", porcentaje, "%");
	}

}
