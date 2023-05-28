package expresionesRegulares;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la ip: ");
		String i = s.next();
		if (i.matches("^([0|1]?[0-9]{1,2})")) {
			System.out.println("La ip es valido");
		} else {
			System.out.println("La ip no es valido");
		}

	}

}
