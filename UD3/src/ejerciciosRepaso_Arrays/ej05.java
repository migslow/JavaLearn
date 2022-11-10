package ejerciciosRepaso_Arrays;

import java.util.Scanner;

public class ej05 {

	public static void rellenar(String[] nom, int[] sue) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce los nombres de los empleados: ");
		for (int i = 0; i < nom.length; i++) {
			System.out.print("Empleado " + i + ": ");
			nom[i] = s.next();
		}
		System.out.println("Introduce los sueldos de los empleados");
		for (int i = 0; i < sue.length; i++) {
			System.out.print("Empleado " + i + ": ");
			sue[i] = s.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Empleado " + i + ": " + "		" + nom[i] + "		" + sue[i]);
		}
	}

	public static int maximo(int[] sueldo) {
		int max = sueldo[0];
		for (int i = 0; i < sueldo.length; i++) {
			if (sueldo[i] > max) {
				max = sueldo[i];
			}
		}
		return max;
	}

	public static void masRico(String[] nom, int[] sue, int maximo) {
		for (int i = 0; i < sue.length; i++) {
			if (sue[i] == maximo(sue)) {
				System.out.println("El empleado mejor pagado es " + nom[i] + " que cobra " + sue[i] + " Euros");
			}
		}
	}

	public static void main(String[] args) {
		String[] nombre = new String[10];
		int[] sueldo = new int[10];
		rellenar(nombre, sueldo);
		System.out.println("\nEl sueldo maximo es: " + maximo(sueldo));
		masRico(nombre, sueldo, maximo(sueldo));
	}
}
