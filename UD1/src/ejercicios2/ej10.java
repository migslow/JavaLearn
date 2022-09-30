package ejercicios2;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lado, area_cuadrado;
		System.out.println("Introduce el lado del area del cuadrado: ");
		lado = s.nextInt();
		area_cuadrado = lado * lado;
		System.out.println("El area del cuadrado es: " + area_cuadrado);

	}

}
