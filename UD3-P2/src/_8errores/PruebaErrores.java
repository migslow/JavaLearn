package _8errores;

import java.util.Scanner;

public class PruebaErrores {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			int[] numeros = new int[10];
			int v1;
			numeros[8] = 25;
			System.out.println("Soy la instruccion AA");
			System.out.println("Soy la instruccion BB");
			System.out.println("Soy la instruccion CC");
			v1 = Integer.parseInt("4");
			v1 = v1 / 1;
			System.out.println("Soy la instruccion DD");
			System.out.println("Introduce un valor entero por teclado: ");
			v1 = s.nextInt();
			System.out.println("Soy la instruccion EE");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Has excedido el limite del array.");
		} catch (NumberFormatException e) {
			System.out.println("No se ha podido realizar la conversión.");
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero. ");
		} catch (Exception e) {
			System.out.println("Ha habido un error. ");
		} finally {
			System.out.println("Esto se ejecuta si o si. FIN");
		}
	}
}
