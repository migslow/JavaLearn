package ejerciciosOrdenacion;

import java.util.Arrays;
import java.util.Comparator;

public class ej02 {

	public static void main(String[] args) {
		Integer[] numeros = { 34, 47, 22, 98 };
		for (int i = 0; i < 1; i++) {
			Arrays.sort(numeros, Comparator.reverseOrder());
			System.out.println(Arrays.toString(numeros));
		}
	}
}
