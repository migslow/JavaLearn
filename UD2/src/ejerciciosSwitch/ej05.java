package ejerciciosSwitch;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la clase a la que pertenece el trabajador: (A-D)");
		char l = s.next().charAt(0);
		System.out.println("Introduce las horas que trabaja durante la semana: ");
		int nH = s.nextInt();
		int sueldo = 0;
		switch (l) {
		case 'a':
		case 'A':
			sueldo = nH * 25;
			System.out.println("El sueldo de un trabajador de clase A es de " + sueldo);
			break;
		case 'b':
		case 'B':
			sueldo = nH * 20;
			System.out.println("El sueldo de un trabajador de clase A es de " + sueldo);
			break;
		case 'c':
		case 'C':
			sueldo = nH * 15;
			System.out.println("El sueldo de un trabajador de clase A es de " + sueldo);
			break;
		case 'd':
		case 'D':
			sueldo = nH * 10;
			System.out.println("El sueldo de un trabajador de clase A es de " + sueldo);
			break;
		default:
			System.out.println("No has introducido una letra entre A y D");
		}

	}

}
