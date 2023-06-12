import java.util.Arrays;

public class ej32 {

	public static double calcularMediana(int[] numeros) {
		// Ordenar el arreglo en orden ascendente
		Arrays.sort(numeros);

		int longitud = numeros.length;
		double mediana;

		if (longitud % 2 == 0) {
			// Si la longitud del arreglo es par, calcular el promedio de los dos valores
			// centrales
			int indice1 = longitud / 2 - 1;
			int indice2 = longitud / 2;
			mediana = (numeros[indice1] + numeros[indice2]) / 2.0;
		} else {
			// Si la longitud del arreglo es impar, el valor central es la mediana
			int indice = longitud / 2;
			mediana = numeros[indice];
		}

		return mediana;
	}

	public static void main(String[] args) {
		int[] numeros = { 7, 2, 9, 1, 5, 6, 3, 8, 4 };
		double mediana = calcularMediana(numeros);
		System.out.println("La mediana es: " + mediana);
	}

}
