package ej03;

public class ej15 {

	public static double media(double[] e) {
		double suma = 0;
		for (int i = 0; i < e.length; i++) {
			suma = suma + e[i];
		}
		return suma / e.length;
	}

	public static void superanMediaEdad(String[] n, double[] e, double media) {
		for (int i = 0; i < n.length; i++) {
			if (e[i] >= media)
				System.out.println("La persona " + n[i] + " superera la media de las edades");
		}

	} // de superanMediaEdad

	public static void masJovenes(String[] n, double[] e) {
		double min = 0;
		int index = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < e.length; j++) {
				min = e[j];
				if (e[j] <= min) {
					min = e[j];
					index = i;
				}
			}
		}
		System.out.println("La edad mas pequeña es: " + min);
		System.out.println("La persona mas joven " + n[index] + " tienen la edad " + min);

	} // masJovenes

	public static void main(String[] args) {
		String[] nombres = { "Alberto", "Rosa", "Luis", "Pilar", "Miguel", "Teo", "Leticia", "Clara", "Javier",
				"Marta" };
		double[] edades = { 45.0, 29.0, 31.0, 25.0, 38.0, 30.0, 26.0, 27.0, 42.0, 25.0 };
		//
		double media = media(edades);
		System.out.println("La media de las edades es: " + media(edades));

		System.out.println();
		superanMediaEdad(nombres, edades, media);
		System.out.println();
		masJovenes(nombres, edades);

	} // del main

}
