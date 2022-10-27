package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. 
Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área. 
Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla
*/

public class ej01 {

	static Scanner s = new Scanner(System.in);

	public static double circulo(double c1) {
		double pi = 3.14;
		double radio, calculo;
		System.out.println("Introduce el radio: ");
		radio = s.nextInt();
		calculo = (radio * pi / 2);
		return calculo;
	}

	public static double triangulo(double b, double a) {
		int base, altura;
		double calculo;
		System.out.println("Introduce la base del triangulo: ");
		base = s.nextInt();
		System.out.println("Introduce la altura del triangulo: ");
		altura = s.nextInt();
		calculo = (double) base * (double) altura / 2;
		return calculo;

	}

	public static double cuadrado(double l1, double l2) {
		double calculo;
		int lado1, lado2;
		System.out.println("Introduce los dos lados que tendra el cuadrado");
		lado1 = s.nextInt();
		lado2 = s.nextInt();
		calculo = lado1 * lado2;
		return calculo;

	}

	public static void main(String[] args) {
		System.out.println("Introduce un numero entre el 1 y 3: ");
		int n = s.nextInt();
		switch (n) {
		case 1:
			System.out.println("Has introducido 1");
			System.out.println("El calculo del circulo es: " + circulo(0));
			break;
		case 2:
			System.out.println("Has introducido 2");
			System.out.println("El calculo del triangulo es: " + triangulo(0, 0));
			break;
		case 3:
			System.out.println("Has introducido 2");
			System.out.println("El calculo del cuadrado es: " + cuadrado(0, 0));
			break;
		default:
			System.out.println("No has introducido un numero entre 1 y 3");
			break;
		}

	}

}
