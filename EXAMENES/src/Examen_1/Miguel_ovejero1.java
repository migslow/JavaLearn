package Examen_1;

import java.util.Scanner;

public class Miguel_ovejero1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 1000000; i++) {
			System.out.println("Introduce los minutos:");
			int min = sc.nextInt();
			if (min >= 1) {
				int dias = min / 60 / 24;
				int anyo = dias / 365;
				int dias2 = dias % 365;
				System.out.println("Años: " + anyo);
				System.out.println("Días :" + dias2);
				System.exit(0);

			}
		}
	}
}
