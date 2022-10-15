package ejerciciosCondicionalesIfElse;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce una nota y INTRO");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		int calculo = (n1 + n2 + n3 + n4) / 4;
		System.out.println("La nota media es: " + calculo);

		if (calculo >= 5) {
			System.out.println("EL alumno esta aprobado");
		} else {
			System.out.println("El alumno no esta aprobado");
		}
	}

}
