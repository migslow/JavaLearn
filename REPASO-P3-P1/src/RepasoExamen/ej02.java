package RepasoExamen;

import java.util.Scanner;

/*
 * No me acuerdo del resultado que salia por consola
 */

public class ej02 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] combinacionGanadora = { 4, 8, 15, 16, 23, 42 };
		int[] numerosApostados = new int[6];

		int aciertos = 0;
		for (int i = 0; i < numerosApostados.length; i++) {
			System.out.println("Introduce los numeros [" + i + "]: ");
			numerosApostados[i] = s.nextInt();
			for (int j = 0; j < combinacionGanadora.length; j++) {
				if (numerosApostados[i] == combinacionGanadora[j]) {
					aciertos++;
				}
			}
		}

	}

}
