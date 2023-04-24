package ej03;

public class ej18 {

	public static void main(String[] args) {
		double notas[][] = { { 5.6, 9.4, 6.8, 7 }, { 6.9, 5.2, 5.7, 6.3 }, { 9.8, 8, 7.6, 8.5 } };
		visualizarAlumno(notas);
	}

	public static void visualizarAlumno(double[][] numeros) {
		double max = 0, min = 0, media = 0;
		for(int i = 0; i < numeros.length;i++) {
			max = numeros[i][0];
			min = numeros[i][0];
			for(int j = 0; j < numeros[i].length;j++) {
				if(numeros[i][j] > max) {
					max = numeros[i][j];
				}
				if(numeros[i][j] < min) {
					min = numeros[i][j];
				}
				media = media + numeros[i][j];
			}
			System.out.println("\nAlumno " + (i + 1) + ": ");
			System.out.print("\nNota maxima: " + max + " ");
			System.out.print("\nNota minima: " + min+ " ");
			System.out.println("\nNota media: " + media / numeros[0].length);
		}
	}
	
	public static void visualizarAsignatura(double[][] numeros) {
		double media = 0, maximo, minimo;
		for (int j = 0; j < numeros[0].length; j++) {
			maximo = numeros[0][j];
			minimo = numeros[0][j];
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i][j] > maximo) {
					maximo = numeros[i][j];
				}
				if (numeros[i][j] < minimo) {
					minimo = numeros[i][j];
				}
				media = media + numeros[i][j];
			}
			System.out.println("\nAsignatura " + (j + 1) + ": ");
			System.out.print("\nNota maxima: " + maximo + " ");
			System.out.print("\nNota minima: " + minimo + " ");
			System.out.println("\nNota media: " + media / numeros.length);
		}
	}

}
