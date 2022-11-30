package Examen_2;

public class MiguelOvejero2 {

	public static void main(String[] args) {
		int[] numeros = new int[20];

		numerosAleatorios(numeros);
		System.out.println();

		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeros[i]) {
				contador++;
			}
			System.out.println("El numero " + numeros[i] + " aparece " + contador + " veces");
		}
	} // del main

	public static int numerosAleatorios(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 201);
			System.out.print(n[i] + " - ");
		}
		return 0;
	}

} // de Pregunta2Alumno
