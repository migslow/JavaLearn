package expresionesRegulares;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero de telefono internacional: ");
		String n = s.next();
		if (n.matches("\\(\\+\\d{2,3}\\)\\d{9}")) {
			System.out.println("El numero internacional es valido");
		} else {
			System.out.println("El numero internacional no es valido");
		}

	}

}
