import java.util.Scanner;

public class ej01 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un numero positivo: ");
		int n = s.nextInt();
		if (n < 0) {
			System.out.println("Has introducido un numero negativo.");
			System.out.println("Vuelve a introducir el numero: ");
			n = s.nextInt();
			if (n >= 0) {
				esPar(n);
			}
		}

	}

	public static void esPar(int numero) {
		if (numero % 2 == 0) {
			System.out.println(numero + " es un numero par");
		} else {
			System.out.println(numero + " es un numero impar");
		}
	}

}
