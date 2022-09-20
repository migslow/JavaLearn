package ejercicios;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int segundos, minutos, horas;
		System.out.println("Introduce los segundos: ");
		segundos = s.nextInt();

		minutos = segundos / 60;
		horas = minutos / 60;

		System.out.println("---------------------------------------------");

		System.out.println(segundos + " segundos");
		System.out.println(minutos + " minutos");
		System.out.println(horas + " horas");
	}

}
