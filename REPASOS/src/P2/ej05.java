package P2;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero entero: ");
		int n = s.nextInt();
		int maximo = 0, minimo = 100, suma = 0, contador = 0;
		double media = 0;
		if (n < 0) {
			System.exit(0);
		}
		while (n >= 0) {
			suma = suma + n;
			contador++;
			if (n > maximo) {
				maximo = n;
			}
			if (n < minimo) {
				minimo = n;
			}
			n = s.nextInt();
		}
		media = suma / contador;
		
		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
		System.out.println("La media es: " + media);

	}

}
