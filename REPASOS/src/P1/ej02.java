package P1;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la longitud: ");
		int longitud = s.nextInt();
		System.out.println("Introduce la anchura: ");
		int anchura = s.nextInt();
		
		int calcular = longitud * anchura;
		System.out.println("Son " + calcular + " metros cuadrados");

	}

}
