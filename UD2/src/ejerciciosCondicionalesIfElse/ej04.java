package ejerciciosCondicionalesIfElse;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre y el signo zoliacal: ");
		String nombre = s.next();
		String signo = s.next();
		String BuscarSigno = "Leo";
		if (BuscarSigno.equals(signo)) {
			System.out.println(nombre + " 23 de luio al 22 de agosto");
		} else {
			System.out.println(nombre);
		}

	}

}
