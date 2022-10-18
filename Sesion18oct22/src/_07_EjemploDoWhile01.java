/*
 * Adaptación del ejemplo Ej16SentenciaSwitch01.java
 */

import java.util.Scanner;

public class _07_EjemploDoWhile01 {
	public static void main(String[] args) {
		int opcion;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println(" CÁLCULO DE ÁREAS");
			System.out.println(" ----------------");
			System.out.println(" 1. Cuadrado");
			System.out.println(" 2. Rectánngulo");
			System.out.println(" 3. Triángulo");
			System.out.println(" 4. Salir");
			System.out.print("\n Elija una opción (1-4): ");

			opcion = s.nextInt();

			double lado;
			double base;
			double altura;

			switch (opcion) {
			case 1:
				System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
				lado = s.nextDouble();
				System.out.println("\nEl Área del cuadrado es " + (lado * lado) + " cm2");
				break;

			case 2:
				System.out.print("\nIntroduzca la base del rectángulo en cm: ");
				base = s.nextDouble();
				System.out.print("Introduzca la altura del rectángulo en cm: ");
				altura = s.nextDouble();
				System.out.println("El Área del rectángulo es " + (base * altura) + " cm2");
				break;

			case 3:
				System.out.print("\nIntroduzca la base del triángulo en cm: ");
				base = s.nextDouble();
				System.out.print("Introduzca la altura del triángulo en cm: ");
				altura = s.nextDouble();
				System.out.println("El Área del triángulo es " + ((base * altura) / 2) + " cm2");
				break;
			case 4:
				System.out.println("Fin del programa1");
				break;
			default:
				System.out.print("\nLo siento, la opción elegida no es correcta.");

			}// del switch
		} while (opcion != 4);
	}// del main
}// de la class
