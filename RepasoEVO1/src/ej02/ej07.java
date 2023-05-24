package ej02;

public class ej07 {

	public static void main(String[] args) {
		int multiplo = 240;
		System.out.println("Los multiplos de " + multiplo + " son: ");
		for (int i = 1; i < multiplo; i++) {
			if (multiplo % i == 0) {
				System.out.println(" " + i);
			}
		}

	}

}
