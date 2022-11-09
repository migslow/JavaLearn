package ejerciciosRepaso_Arrays;

import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);
	
	public static int sueldoEmpleado(int [] nom, int max) {
		int n = nom[0];
		for (int i = 0; i < nom.length; i++) {
			if (nom[i] == max) {
				max = nom[i];
				System.out.println("El empleado " + nom[i] + " cobrando " + max + " tiene el sueldo mas alto");
			}
		}
		return max;
	}
	
	public static int maximoSueldo(int [] sueldo) {
		int maximo = sueldo[0];
		for (int i = 0; i < sueldo.length; i++) {
			if (sueldo[i] > maximo) {
				maximo = sueldo[i];
			}
		}
		return maximo;
	}

	public static void main(String[] args) {
		String[] nombre = new String[10];
		int[] sueldo = new int[10];
		System.out.println("Introduce el nombre de los trabajadores: ");
		for (int i = 0; i < nombre.length; i++) {
			System.out.print("Elemento " + i + ": ");
			nombre[i] = s.next();
		}
		System.out.println("Introduce el sueldo de los trabajadores: ");
		for (int i = 0; i < sueldo.length; i++) {
			System.out.print("Elemento " + i + ": ");
			sueldo[i] = s.nextInt();
		}
		System.out.println("\nLos nombres son: ");
		for (String c : nombre) {
			System.out.println(c);
		}
		System.out.println("\nLos sueldos son: ");
		for (int c : sueldo) {
			System.out.println(c);
		}
		int max = maximoSueldo(sueldo);
		System.out.println("El sueldo maximo es: " + maximoSueldo(sueldo));
		sueldoEmpleado(sueldo, max);
	}
}
