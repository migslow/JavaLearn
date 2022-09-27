package ejercicios1;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double longitud, anchura;
		System.out.println("Introduce la longitud: ");
		longitud = s.nextDouble();
		System.out.println("Introduce la anchura: ");
		anchura = s.nextDouble();
		System.out.printf("Superficie : %.4f%s", (longitud * anchura), " m2");
	}

}
