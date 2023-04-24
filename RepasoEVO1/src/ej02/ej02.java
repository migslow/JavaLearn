package ej02;

public class ej02 {

	public static void main(String[] args) {
		int contador = 0;
		int minimo = 100;
		for (int i = 0; i <= 15; i++) {

			int rdm = (int) (Math.random() * 21);
			System.out.print(rdm + " ");
			if (i == 100) {
				minimo = rdm;
			}
			if (rdm < minimo) {
				minimo = rdm;
			}
			if (minimo == rdm) {
				contador++;
			}
		}
		System.out.println("\nEl numero que se busca: " + minimo);
		System.out.println("El numero " + minimo + " se cuenta " + contador + " veces");

	}

}
