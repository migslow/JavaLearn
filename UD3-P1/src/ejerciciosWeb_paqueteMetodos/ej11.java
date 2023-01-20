package ejerciciosWeb_paqueteMetodos;

/*
 * Crea  métodos que permita ingresar el nombre , marca  y el precio de un hardware , si este producto cuesta mas de 320 soles , 
 * añadirle el 16% de recargo, caso contrario 10 soles por concepto de movilidad.
 */

import java.util.Scanner;

public class ej11 {

	static Scanner s = new Scanner(System.in);

	public static int producto(int p) {
		System.out.println("Introduce el nombre de un producto hardware: ");
		String nombre = s.next();
		System.out.println("Introduce la marca del producto: ");
		String marca = s.next();
		System.out.println("Introduce el precio del nombre del producto hardware: ");
		int precio = s.nextInt();
		if (precio > 320) {
			int recargo = (int) (precio * 0.16);
			System.out.println("El precio final con recargo es de: " + recargo);
		} else {
			System.out.println("El precio por concepto de movilidad es de: " + precio + 10);
		}
		return p;
	}

	public static void main(String[] args) {
		producto(0);
	}

}
