package ejerciciosWebOrdenacion;

import java.util.Arrays;

public class ej02 {

	public static void main(String[] args) {
		String[] numeros = { "1", "2", "3", "4", "5", "1", "1", "4" };
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (i != j) {
					if (numeros[i].equals(numeros[j])) {
						numeros[i] = "";
					}
				}
			}
		}
		Arrays.sort(numeros);
		for (String t : numeros) {
			System.out.println(t);
		}
	}

}
