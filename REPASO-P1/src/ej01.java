

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el tiempo en segundos: ");
		int segundos = s.nextInt();
		int minutos = segundos / 60;
		int horas = minutos / 60;
		
		System.out.println("Los segundos son: " + segundos);
		System.out.println("Los minutos son: " + minutos);
		System.out.println("Las horas son: " + horas);
	}

}
