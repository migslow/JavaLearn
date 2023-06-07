package RepasoExamen;

public class ej04 {

	public static double media(double[] e) {
		double suma = 0;
		for (int i = 0; i < e.length; i++) {
			suma = suma + e[i];
		}
		return suma / e.length;
	}

	public static void superanMediaEdad(String[] n, double[] e) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] >= media(e)) {
				System.out.println("La persona " + n[i] + " supera la media de las edades");
			}
		}
	}

	public static void masJovenes(String[] n, double[] e) {
		int min = 0;
		String index = null;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < e.length; j++) {
				min = (int) e[j];
				if (e[j] <= min) {
					min = (int) e[j];
					index = n[i];
				}
			}
		}
		System.out.println("La edad mas pequeña es: " + min);
		System.out.println("La persona mas joven " + index + " tienen la edad " + min);
	}

	public static void main(String[] args) {
		String[] nombres = { "Alberto", "Rosa", "Luis", "Pilar", "Miguel", "Teo", "Leticia", "Clara", "Javier",
				"Marta" };
		double[] edades = { 45.0, 29.0, 31.0, 25.0, 38.0, 30.0, 26.0, 27.0, 42.0, 25.0 };
		superanMediaEdad(nombres, edades);
		masJovenes(nombres, edades);
	}

}
