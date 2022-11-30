package Examen_2;

public class MiguelOvejero1 {
	public static void sonIguales(int[] v1, int[] v2) {
		if (v1.length != v2.length) {
			System.out.println("No son iguales");
		}
		if (v1.length == v2.length) {
			System.out.println("Son iguales");
		}

	} // de sonIguales

	public static void main(String[] args) {
		int[] v1 = { 2, 5, 7, 9, 11 };
		int[] v2 = { 2, 5, 7, 9, 11 };
		int[] v3 = { 2, 5, 7, 9, 11, 13 };
		int[] v4 = { 2, 5, 7, 9, 10 };
		int[] v5 = { 2, 5, 7, 9, 11, 13 };
		int[] v6 = { 2, 5, 8, 9, 11, 13 };
		int[] v7 = { 2, 5, 8, 9, 11, 13, 15, 45, 78 };
		int[] v8 = { 2, 5, 7, 9, 10 };

		sonIguales(v1, v2); // son iguales!!
		sonIguales(v1, v3); // NO son iguales!!
		sonIguales(v1, v4); // NO son iguales!!
		sonIguales(v3, v5); // son iguales!!
		sonIguales(v5, v6); // NO son iguales!!
		sonIguales(v1, v7); // NO son iguales!!
		sonIguales(v4, v8); // son iguales!!
	} // del main
} // de Pregunta1Alumno
