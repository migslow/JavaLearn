package ejercicios;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int meses = 12, mes = 8;
		double porcentaje = (double) mes * 100 / (double) meses;

		System.out.println("Mes " + mes + " de " + meses);
		System.out.printf("Porcentaje transcurrido: %.4f", porcentaje, "%");
	}

}
