package ejercicios_paquetesArrays;

public class ej05 {

	public static void main(String[] args) {
		int contador = 0;
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 101);

		}

		for (int i = 0; i < cuadrado.length; i++) {
			cuadrado[i] = numero[i] * numero[i];
		}

		for (int i = 0; i < cubo.length; i++) {
			cubo[i] = (int) (Math.pow(numero[i], 3));
		}

		for (int i = 0; i < 20; i++) {
			System.out.println(
					"Elemento " + i + ": " + "		" + numero[i] + "		" + cuadrado[i] + "			" + cubo[i]);
		}
	}

} // del main
