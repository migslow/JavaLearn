package ejerciciosWeb_paqueteArrays;

/*
 * Ingresar por teclado 5 notas y mostrar el promedio.
 */

import java.util.Scanner;

public class ej10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double notas[] = new double[6];
		int contador = 1;
		double promedio, sum = 0;
		while (contador < 6) {
			System.out.println("Ingrese la " + contador + "° nota : ");
			notas[contador] = s.nextFloat();
			sum = sum + notas[contador];
			contador++;
		}
		promedio = sum / 5;
		System.out.println("Su promedio es : " + promedio);
	}
}
