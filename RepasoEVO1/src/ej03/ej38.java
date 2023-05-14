package ej03;

import java.util.Scanner;

public class ej38 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] sueldo = new int[2];
		String[] nombre = new String[2];
		rellenarArray(sueldo, nombre);
		masRico(sueldo, nombre, maximo(sueldo));
	}

	public static void rellenarArray(int[] v, String[] n) {
		System.out.println("Introduce los nombres de los empleados: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print("Empleado " + i + ": ");
			n[i] = s.nextLine();
		}
		System.out.println("Introduce los sueldos de los empleados");
		for (int i = 0; i < v.length; i++) {
			System.out.print("Empleado " + i + ": ");
			v[i] = s.nextInt();
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println("Empleado " + i + ": " + "		" + n[i] + "		" + v[i]);
		}
	}

	public static int maximo(int[] v) {
		int maximo = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > maximo) {
				maximo = v[i];
			}
		}
		return maximo;
	}

	public static void masRico(int[] v, String[] n, int maximo) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == maximo(v)) {
				System.out.println("El empleado mejor pagado es " + n[i] + " que cobra " + v[i] + " Euros");
			}
		}
	}

}
