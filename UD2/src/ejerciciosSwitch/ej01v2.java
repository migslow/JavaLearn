package ejerciciosSwitch;

import java.util.Scanner;

public class ej01v2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 5;
		int n2 = 20;
		int resultado;
		int parametro;
		do {
			System.out.println("Introduce un numero entero entre 1-5: ");
			parametro = s.nextInt();
			switch (parametro) {
			case 1:
				resultado = n1 + n2;
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case 2:
				resultado = n1 - n2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case 3:
				resultado = n1 * n2;
				System.out.println("El resultado de la multiplicacion es: " + resultado);
				break;
			case 4:
				resultado = n1 / n2;
				System.out.println("El resultado de la division es: " + resultado);
			case 5:
				System.exit(0);
			default:
				System.out.println("No has introducido un numero entre 1 y 5");
				break;
			}
		} while (!(parametro >= 1 && parametro <= 5));
	}
}
