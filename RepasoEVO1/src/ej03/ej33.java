package ej03;

public class ej33 {

	public static void main(String[] args) {
		double[] altura = { 1.75, 1.68, 1.9, 2.04, 1.85, 1.66, 1.55, 1.88, 1.45, 1.82, 2.01, 1.79, 1.8, 1.56, 1.69,
				1.79, 1.83, 1.75 };
		System.out.println("\nEl numero de estaturas descartadas es: " + alturasDescartadas(altura));
		System.out.println("\nLa media es: " + media(altura));
	}
	
	public static int alturasDescartadas(double[] altura) {
		int contador = 0;
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] < 1.50 || altura[i] > 2.00) {
				contador++;
			}
		}
		return contador;
	}
	
	public static double media(double[] altura) {
		double suma = 0;
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] > 1.00) {
				suma = suma + altura[i];
			}
		}
		return suma / altura.length;
	}

}
