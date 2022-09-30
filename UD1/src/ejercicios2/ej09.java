package ejercicios2;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double sueldo;
		int horas;
		System.out.println("Introduce el numero de horas que ha trabajado este mes: ");
		horas = s.nextInt();
		sueldo = horas * 10;
		System.out.println("Este mes ha cobrado: " + sueldo + "€");

	}

}
