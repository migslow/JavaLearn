package ejercicios2;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero positivo");
		int n = s.nextInt();
		int contador = 0;
		while (n != -1) {
			contador++;
			n = s.nextInt();
			
		}
			
		System.out.println("Se ha introducido " + contador + " numeros");

	}

}
