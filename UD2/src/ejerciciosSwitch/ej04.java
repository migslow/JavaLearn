package ejerciciosSwitch;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero de hijos: ");
		int hijos = s.nextInt();
		int asigna = 0;
		switch (hijos) {
		case 0:
			asigna = 0;
			System.out.println("Al tener " + hijos + " hijos, tendrá una asignacion familiar de " + asigna + " soles");
			break;
		case 1:
			asigna = 50;
			System.out.println("Al tener " + hijos + " hijos, tendrá una asignacion familiar de " + asigna + " soles");
			break;
		case 2:
			asigna = 75;
			System.out.println("Al tener " + hijos + " hijos, tendrá una asignacion familiar de " + asigna + " soles");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			asigna = 100;
			System.out.println("Al tener " + hijos + " hijos, tendrá una asignacion familiar de " + asigna + " soles");
			break;
		default:
			System.out.println("No crees que ya es hora de parar?");
			break;
		}

	}

}
