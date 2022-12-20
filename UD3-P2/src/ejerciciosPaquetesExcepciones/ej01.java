package ejerciciosPaquetesExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Introduce un numero entero por teclado: ");
			int n = s.nextInt();
			System.out.println(n);
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
}
