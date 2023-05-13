package ej02;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int intentos = 3;
		int n = 0, contador = 0;
		int numeroAcertante = 1;
		
		for (int i = 1; i < intentos; i++) {
			System.out.println("Introduce un numero entero entre 1 y 10: ");
			n = s.nextInt();
		}
		
		for(int i = 0; i< intentos; i++) {
			contador = contador + i;
			contador++;
		}
		if(n != numeroAcertante) {
			System.out.println("No es el numero que estoy buscando. Intento nº:" + contador + "- Introduzca un numero entre 1 y 10");
		} else if(n == numeroAcertante){
			System.out.println("Acertaste el numero " + n + " en " + contador + " intentos ");
		}
	}
}
