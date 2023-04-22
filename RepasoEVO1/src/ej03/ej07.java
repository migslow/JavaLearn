package ej03;

public class ej07 {

	public static void main(String[] args) {
		int[] numeros = new int[20];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeroAleatorio();
			System.out.print(numeros[i] + " - ");
		}

	}

	public static int numeroAleatorio() {
		return (int) (Math.random() * 100);
	}

}
