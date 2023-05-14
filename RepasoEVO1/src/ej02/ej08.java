package ej02;

public class ej08 {

	public static void main(String[] args) {
		int numero = 9;
		int valorInicial = 9;
		int valorFinal = 180;
		int contador = 0;

		System.out.println("Los múltiplos de " + numero + " entre " + valorInicial + " y " + valorFinal + " son:");
		for (int i = valorInicial; i <= valorFinal; i++) {
			if (i % numero == 0) {
				contador++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nAparecen " + contador + " numeros");
	}

}
