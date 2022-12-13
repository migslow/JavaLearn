package _03colecciones2_2;

import java.util.ArrayList;

public class MainEnvoltorio {
	public static void main(String[] args) {

		/*
		 * int i0 = 11; int i23; Integer i1 = new Integer(33); Integer i2 = 55; Integer
		 * i3 = i0; i23 = i2;
		 */

		ArrayList<Integer> coleccion = new ArrayList<Integer>();

		coleccion.add(34);
		coleccion.add(55);
		coleccion.add(12);
		coleccion.add(66);

		for (int i = 0; i < coleccion.size(); i++) {
			System.out.print(coleccion.get(i) + " - ");
		}
		System.out.print("\n");

		/*
		 * System.out.println(coleccion.remove(1)); System.out.println(coleccion);
		 */

		/*
		 * coleccion.remove(new Integer(12)); System.out.println(coleccion);
		 */

		System.out.println(coleccion.contains(66)); // devuelve true o false si el entero aparece
		System.out.println(coleccion.indexOf(12));// devuelve la posicion del entero si lo encuentra

	}

}
