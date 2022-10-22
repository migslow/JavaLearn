
import java.util.Scanner;

public class _08_EjemploDoWhile02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Introduzca un n�mero entre 1 y 10");
			numero = s.nextInt();
		} while (numero < 1 || numero > 10);
		System.out.println("Correcto");
	}
}
